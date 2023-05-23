package org.lafabrique.moodly.infra;

import org.lafabrique.moodly.domaine.MoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoodEntryRepo extends JpaRepository<MoodEntry, Long> {
}
