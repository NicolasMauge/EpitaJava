package org.lafabrique.moodly.application;

import org.lafabrique.moodly.domaine.Activity;

public interface ActivityService {
    void createActivity(Activity activity);

    Activity findActivityById(Long id);

    void updateActivityById(Activity activity);

    void deleteActivity(Activity activity);
}
