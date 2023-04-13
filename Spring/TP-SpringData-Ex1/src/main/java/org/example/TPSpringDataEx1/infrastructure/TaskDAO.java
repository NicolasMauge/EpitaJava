package org.example.TPSpringDataEx1.infrastructure;

import org.example.TPSpringDataEx1.domaine.Status;
import org.example.TPSpringDataEx1.domaine.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskDAO extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Status status);

    List<Task> findByTitle(String title);
}
