package joao.ac1.service;

import joao.ac1.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(Task task);
}