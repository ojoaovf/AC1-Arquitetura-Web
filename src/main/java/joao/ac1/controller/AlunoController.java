package joao.ac1.controller;

import joao.ac1.model.Aluno;
import joao.ac1.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> getAllTasks() {
        return alunoService.getAllAluno();
    }

    @GetMapping("/{id}")
    public Aluno getTaskById(@PathVariable Long id) {
        return alunoService.getAlunoById(id);
    }

    @PostMapping("/add")
    public Aluno createAluno(@RequestBody Aluno aluno){
        return alunoService.createAluno(aluno);
    }

    @PutMapping("/update/{id}")
    public Aluno update(@PathVariable("id") Long id, @RequestBody Aluno aluno) {
        return alunoService.update(aluno);
    }
    @DeleteMapping("/del/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        alunoService.deleteById(id);
    }

}