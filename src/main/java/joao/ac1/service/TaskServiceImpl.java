package joao.ac1.service;

import joao.ac1.model.Task;
import joao.ac1.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/*
A anotação @Service é usada para marcar uma classe como um componente de serviço no contexto do Spring. Indica
que a classe é uma parte central da lógica de negócios ou executa operações de serviço.
 */
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    /*
    A injeção de dependência está evidenciada no construtor da classe TaskService. Aqui, TaskService depende de
    TaskRepository, que é passado como um parâmetro no construtor. O Spring será responsável por injetar uma instância
    de TaskRepository quando criar uma instância de TaskService.
     */
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    // Adicionar método para atualizar a tarefa
    @Override
    public Task update(Task task) {
        return taskRepository.update(task);
    }
}