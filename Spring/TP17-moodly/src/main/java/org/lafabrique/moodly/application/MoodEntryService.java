package org.lafabrique.moodly.application;

import org.lafabrique.moodly.domaine.MoodEntry;

public interface MoodEntryService {
    void createMoodEntry(MoodEntry moodEntry);

    MoodEntry findMoodEntryById(Long id);

    void updateMoodEntry(MoodEntry moodEntry);

    void deleteMoodEntry(MoodEntry moodEntry);
}
