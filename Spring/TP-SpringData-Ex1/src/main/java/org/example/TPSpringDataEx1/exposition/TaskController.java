package org.example.TPSpringDataEx1.exposition;


import org.example.TPSpringDataEx1.application.TaskService;
import org.example.TPSpringDataEx1.domaine.Status;
import org.example.TPSpringDataEx1.domaine.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("/create")
    public void create(@RequestBody Task task) {
        taskService.create(task);
    }

    @PostMapping("/update")
    public void update(@RequestBody Task task) {
        taskService.update(task);
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable("id") Long id) {
        return taskService.findById(id);
    }

    @GetMapping("/status/{status}")
    public List<Task> findByStatus(@PathVariable("status") Status status) {
        return taskService.findByStatus(status);
    }

    @GetMapping("/title/{title}")
    public List<Task> findByTitle(@PathVariable("title") String title) {
        return taskService.findByTitle(title);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        taskService.delete(id);
    }
}
