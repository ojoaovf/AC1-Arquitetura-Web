package joao.ac1.repository;

import joao.ac1.model.Task;
import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    Task save(Task task);
    void deleteById(Long id);

    Task update(Task task);
}
