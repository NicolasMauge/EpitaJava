package org.lafabrique.moodly.exposition;

import org.lafabrique.moodly.application.MoodEntryService;
import org.lafabrique.moodly.converter.convertMoodEntry;
import org.lafabrique.moodly.domaine.MoodEntry;
import org.lafabrique.moodly.dto.MoodEntryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/v1/moods")
public class MoodsController {
    @Autowired
    MoodEntryService moodEntryService;

    @PostMapping
    public void createMoodEntry(@RequestBody MoodEntryDto moodEntryDto) {
        MoodEntry moodEntry = convertMoodEntry.convertMoodEntryDtoToMoodEntryEntity(moodEntryDto);

        moodEntryService.createMoodEntry(moodEntry);
    }

    @GetMapping("/{id}")
    public MoodEntryDto findMoodEntryById(@PathVariable("id") Long id) throws EntityNotFoundException {
        MoodEntry moodEntry = moodEntryService.findMoodEntryById(id);

        if (moodEntry != null) {
            return convertMoodEntry.convertMoodEntryEntityToMoodEntryDto(moodEntry);
        }
        else {
            throw new EntityNotFoundException("L'id ne correspond pas à une humeur existante");
        }
    }

    @PutMapping("/{id}")
    public void updateMoodEntry(@PathVariable("id") Long id, @RequestBody MoodEntryDto moodEntryDto) throws EntityNotFoundException {
        MoodEntry moodEntry = convertMoodEntry.convertMoodEntryDtoToMoodEntryEntity(moodEntryDto);

        if (moodEntry.getId() == id) {
            moodEntryService.updateMoodEntry(moodEntry);
        }
        else {
            throw new EntityNotFoundException("L'id ne correspond pas à l'humeur fournie");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteMoodEntry(@PathVariable("id") Long id) throws EntityNotFoundException {
        MoodEntry moodEntry = moodEntryService.findMoodEntryById(id);

        if (moodEntry != null) {
            moodEntryService.deleteMoodEntry(moodEntry);
        } else {
            throw new EntityNotFoundException("L'id ne correspond pas à une humeur existante");
        }
    }

}
