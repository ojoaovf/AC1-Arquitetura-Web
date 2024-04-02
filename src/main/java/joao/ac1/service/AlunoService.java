package joao.ac1.service;

import joao.ac1.model.Aluno;

import java.util.List;

public interface AlunoService {
    List<Aluno> getAllAluno();
    Aluno getAlunoById(Long id);
    Aluno createAluno(Aluno aluno);
    void deleteById(Long id);
    Aluno update(Aluno aluno);
}
