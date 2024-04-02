package joao.ac1.repository;

import joao.ac1.model.Aluno;

import java.util.List;

public interface AlunoRepository {
    List<Aluno> findAll();
    Aluno findById(Long id);
    Aluno save(Aluno aluno);
    void deleteById(Long id);

    Aluno update(Aluno aluno);
}
