package joao.ac1.service;

import joao.ac1.model.Task;
import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(Task task);
    void deleteById(Long id);
    //Task updateTask(Task task);

    // Adicionar método para atualizar a tarefa
    Task update(Task task);
}
