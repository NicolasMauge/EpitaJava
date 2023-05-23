package org.lafabrique.moodly.infra;

import org.lafabrique.moodly.domaine.Activity;
import org.lafabrique.moodly.domaine.MoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoodEntryRepo extends JpaRepository<MoodEntry, Long> {
    //@Query("SELECT a FROM MoodEntry a where a.user_id=:id and a.mood=true")
    //List<Activity> findHappyActivityForUserById(Long id);

    //@Query("SELECT a FROM MoodEntry a where a.user_id=:id and a.mood=false")
    //List<Activity> findSadActivityForUserById(Long id);
}
