package org.lafabrique.moodly.application;

import org.lafabrique.moodly.domaine.Activity;
import org.lafabrique.moodly.infra.ActivityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityRepo activityRepo;

    @Override
    public void createActivity(Activity activity) {
        activityRepo.save(activity);
    }

    @Override
    public Activity findActivityById(Long id) {
        Optional<Activity> optionalActivity = activityRepo.findById(id);
        if (!optionalActivity.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return optionalActivity.get();
        }
    }

    @Override
    public void updateActivityById(Activity activity) {
        activityRepo.save(activity);
    }

    @Override
    public void deleteActivity(Activity activity) {
        activityRepo.delete(activity);
    }
}
