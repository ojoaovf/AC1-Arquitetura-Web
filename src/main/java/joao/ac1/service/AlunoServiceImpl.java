package joao.ac1.service;

import joao.ac1.model.Aluno;
import joao.ac1.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/*
A anotação @Service é usada para marcar uma classe como um componente de serviço no contexto do Spring. Indica
que a classe é uma parte central da lógica de negócios ou executa operações de serviço.
 */
@Service
public class AlunoServiceImpl implements AlunoService {
    private final AlunoRepository alunoRepository;

    /*
    A injeção de dependência está evidenciada no construtor da classe AlunoService. Aqui, AlunoService depende de
    AlunoRepository, que é passado como um parâmetro no construtor. O Spring será responsável por injetar uma instância
    de AlunoRepository quando criar uma instância de AlunoService.
     */
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
        return alunoRepository.update(aluno);
    }
}