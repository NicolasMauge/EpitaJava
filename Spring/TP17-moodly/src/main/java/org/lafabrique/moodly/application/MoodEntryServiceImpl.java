package org.lafabrique.moodly.application;

import org.lafabrique.moodly.domaine.MoodEntry;
import org.lafabrique.moodly.infra.MoodEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class MoodEntryServiceImpl implements MoodEntryService {
    @Autowired
    MoodEntryRepo moodEntryRepo;

    @Override
    public void createMoodEntry(MoodEntry moodEntry) {
        moodEntryRepo.save(moodEntry);
    }

    @Override
    public MoodEntry findMoodEntryById(Long id) {
        Optional<MoodEntry> optionalMoodEntry = moodEntryRepo.findById(id);
        if (!optionalMoodEntry.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return optionalMoodEntry.get();
        }
    }

    @Override
    public void updateMoodEntry(MoodEntry moodEntry) {
        moodEntryRepo.save(moodEntry);
    }

    @Override
    public void deleteMoodEntry(MoodEntry moodEntry) {
        moodEntryRepo.delete(moodEntry);
    }
}
