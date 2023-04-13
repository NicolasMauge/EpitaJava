package org.example.TPSpringDataEx1.application;

import org.example.TPSpringDataEx1.domaine.Status;
import org.example.TPSpringDataEx1.domaine.Task;

import java.util.List;

public interface TaskService {
    void create(Task task);

    void update(Task task);

    Task findById(Long id);

    List<Task> findByStatus(Status status);

    List<Task> findByTitle(String title);

    void delete(Long id);
}
