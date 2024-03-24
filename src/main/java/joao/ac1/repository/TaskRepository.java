package joao.ac1.repository;

import joao.ac1.model.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    Task save(Task task);
    void deleteById(Long id);
}