package org.lafabrique.moodly.infra;

import org.lafabrique.moodly.domaine.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Queue;

@Repository
public interface ActivityRepo extends JpaRepository<Activity, Long> {
    @Query("SELECT a FROM Activity a JOIN FETCH b.user u where u.id=:id and a.mood=true")
    List<Activity> findHappyActivityForUserById(Long id);

    @Query("SELECT a FROM Activity a JOIN FETCH b.user u where u.id=:id and a.mood=false")
    List<Activity> findSadActivityForUserById(Long id);
}
