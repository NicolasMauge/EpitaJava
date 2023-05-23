package org.lafabrique.moodly.exposition;

import org.lafabrique.moodly.application.ActivityService;
import org.lafabrique.moodly.application.ActivityServiceImpl;
import org.lafabrique.moodly.converter.convertActivities;
import org.lafabrique.moodly.converter.convertMoodEntry;
import org.lafabrique.moodly.domaine.Activity;
import org.lafabrique.moodly.domaine.MoodEntry;
import org.lafabrique.moodly.dto.ActivityDto;
import org.lafabrique.moodly.dto.MoodEntryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/v1/activities")
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @PostMapping
    public void createActivity(@RequestBody ActivityDto activityDto) {
        Activity activity = convertActivities.convertActivityDtoToActivityEntity(activityDto);

        activityService.createActivity(activity);
    }

    @GetMapping("/{id}")
    public ActivityDto findActivityById(@PathVariable("id") Long id) throws EntityNotFoundException {
        Activity activity = activityService.findActivityById(id);

        if (activity != null) {
            return convertActivities.convertActivityEntityToActivityDto(activity);
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
