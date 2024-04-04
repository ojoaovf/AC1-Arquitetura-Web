package joao.ac1.model;

import java.util.List;

public interface AlunoRepository {
    List<Aluno> findAll();

    Aluno findById(Long id);
    Aluno save(Aluno aluno);
    void deleteById(Long id);

    Aluno delete(int id);
    //Aluno update(Aluno aluno);
}
