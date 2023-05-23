package org.lafabrique.moodly.infra;

import org.lafabrique.moodly.domaine.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Queue;

@Repository
public interface ActivityRepo extends JpaRepository<Activity, Long> {

}
