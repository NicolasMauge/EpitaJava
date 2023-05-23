package org.lafabrique.moodly.exposition;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.lafabrique.moodly.application.ActivityService;
import org.lafabrique.moodly.application.QueueActivityService;
import org.lafabrique.moodly.converter.convertActivities;
import org.lafabrique.moodly.domaine.Activity;
import org.lafabrique.moodly.dto.ActivityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/v1/activities")
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    QueueActivityService queueActivityService;

    @PostMapping
    public void createActivity(@RequestBody ActivityDto activityDto) {
        Activity activity = convertActivities.convertActivityDtoToActivityEntity(activityDto);

        activityService.createActivity(activity);
    }

    @GetMapping("/{id}")
    public ActivityDto findActivityById(@PathVariable("id") Long id) throws EntityNotFoundException {
        Activity activity = activityService.findActivityById(id);

        if (activity != null) {
            ActivityDto activityDto = convertActivities.convertActivityEntityToActivityDto(activity);

            try {
                String json = objectMapper.writeValueAsString(activityDto);
                queueActivityService.sendMessage(json);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

            return activityDto;
        }
        else {
            throw new EntityNotFoundException("L'id ne correspond pas à une activité existante");
        }
    }

    @PutMapping("/{id}")
    public void updateActivity(@PathVariable("id") Long id, @RequestBody ActivityDto activityDto) throws EntityNotFoundException {
        Activity activity = convertActivities.convertActivityDtoToActivityEntity(activityDto);

        if (id == activity.getId()) {
            activityService.updateActivityById(activity);
        }
        else {
            throw new EntityNotFoundException("L'id ne correspond pas à la modification fournie");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteActivity(@PathVariable("id") Long id) throws EntityNotFoundException {
        Activity activity = activityService.findActivityById(id);

        if(activity != null) {
            activityService.deleteActivity(activity);
        }
        else {
            throw new EntityNotFoundException("L'id ne correspond pas à une activité existante");
        }
    }
}
