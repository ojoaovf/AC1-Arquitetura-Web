package joao.ac1.service;

import joao.ac1.model.Aluno;
import joao.ac1.model.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Aluno> getAllAluno() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id);
    }

    @Override
    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }

    // Adicionar método para atualizar a tarefa
    @Override
    public Aluno update(Aluno aluno) {
        return null;
    }
}