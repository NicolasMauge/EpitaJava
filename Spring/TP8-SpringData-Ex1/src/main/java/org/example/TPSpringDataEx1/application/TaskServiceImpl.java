package org.example.TPSpringDataEx1.application;

import org.example.TPSpringDataEx1.domaine.Status;
import org.example.TPSpringDataEx1.domaine.Task;
import org.example.TPSpringDataEx1.infrastructure.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskDAO dao;

    @Override
    public void create(Task task) {
        dao.save(task);
    }

    @Override
    public void update(Task task) {
        dao.save(task);
    }

    @Override
    public Task findById(Long id) {
        Optional<Task> optionalTask = dao.findById(id);
        if(!optionalTask.isPresent()) {
            throw new EntityNotFoundException();
        }
        return dao.findById(id).get();
    }

    @Override
    public List<Task> findByStatus(Status status) {
        return dao.findByStatus(status);
    }

    @Override
    public List<Task> findByTitle(String title) {
        return dao.findByTitle(title);
    }

    @Override
    public void delete(Long id) {
        Task task = findById(id);
        dao.delete(task);
    }
}
