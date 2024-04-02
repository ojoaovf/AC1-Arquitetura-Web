package joao.ac1.controller;

import joao.ac1.model.Task;
import joao.ac1.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/add")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @DeleteMapping("/del/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        taskService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Task update(@PathVariable("id") Long id, @RequestBody Task task) {
        return taskService.update(task);
    }
}