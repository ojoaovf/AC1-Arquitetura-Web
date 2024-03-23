package joao.ac1.repository;

import joao.ac1.model.Task;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

/*
Esta anotação é usada para indicar que a classe é um componente de acesso a dados (repositório).
Ela informa ao Spring que a classe anotada como @Repository é responsável por interagir com a fonte de dados, como um
banco de dados, fornecendo operações CRUD (create, read, update, delete) para uma entidade específica.
 */
@Repository
public class TaskRepositoryImpl implements TaskRepository {

    /*
    O JdbcTemplate é uma classe oferecida pelo Spring Framework para simplificar o uso do JDBC (Java Database Connectivity)
    e interagir com bancos de dados relacionais de uma maneira mais fácil e eficiente. Ele fornece métodos convenientes
    para executar operações comuns do JDBC, como consultas, atualizações, inserções e exclusões de dados no banco de dados.
     */
    private final JdbcTemplate jdbcTemplate;

    /*
    A injeção acontecendo no contrutor
     */
    public TaskRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Task> findAll() {
        /*
        Este método executa uma consulta SQL no banco de dados usando a instrução SELECT * FROM task. Ele espera uma função
        lambda (ou expressão lambda) como segundo argumento para mapear os resultados.
         */
        return jdbcTemplate.query("SELECT * FROM dados_pessoais", (resultSet, rowNum) -> {
                    System.out.println("Numero da linha: " + rowNum);
                    return new Task(
                            resultSet.getLong("id"),
                            resultSet.getString("nome"),
                            resultSet.getString("idade"),
                            resultSet.getString("sexo"),
                            resultSet.getString("email"),
                            resultSet.getString("nacionalidade")
                    );
                }
        );
    }

    @Override
    public Task findById(Long id) {
        String query = "SELECT * FROM dados_pessoais WHERE id = ?";
        /*
        Este método é usado para executar uma consulta SQL que retorna um único resultado. Ele espera a consulta SQL,
        um array de parâmetros de consulta (nesse caso, o ID) e uma função lambda que mapeia o resultado do banco de dados
        para um objeto Java.

        A quantidade e ordem de atributos no array de parametros deve ser a mesma na consulta SQL.
         */
        return jdbcTemplate.queryForObject(query, new Object[]{id}, (resultSet, rowNum) ->
                new Task(
                        /*
                        Para se recuperar os valores das colunas é preciso saber o tipo e o nome, pois os métodos são
                        especificos
                         */
                        resultSet.getLong("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("idade"),
                        resultSet.getString("sexo"),
                        resultSet.getString("email"),
                        resultSet.getString("nacionalidade")
                )
        );
    }
    // Capturando valores pelo Nome ------------------------------------------------------------------------------------
    public Task findByNome(String nome) {
        String query = "SELECT * FROM dados_pessoais WHERE nome = ?";

        return jdbcTemplate.queryForObject(query, new Object[]{nome}, (resultSet, rowNum) ->
                new Task(
                        resultSet.getLong("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("idade"),
                        resultSet.getString("sexo"),
                        resultSet.getString("email"),
                        resultSet.getString("nacionalidade")
                )
        );
    }
    //  Capturando valores pela idade ----------------------------------------------------------------------------------
    public Task findByIdade(String idade) {
        String query = "SELECT * FROM dados_pessoais WHERE idade = ?";

        return jdbcTemplate.queryForObject(query, new Object[]{idade}, (resultSet, rowNum) ->
                new Task(
                        resultSet.getLong("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("idade"),
                        resultSet.getString("sexo"),
                        resultSet.getString("email"),
                        resultSet.getString("nacionalidade")
                )
        );
    }
    //  Capturando valores pelo sexo -----------------------------------------------------------------------------------
    public Task findBySexo(String sexo) {
        String query = "SELECT * FROM dados_pessoais WHERE sexo = ?";

        return jdbcTemplate.queryForObject(query, new Object[]{sexo}, (resultSet, rowNum) ->
                new Task(
                        resultSet.getLong("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("idade"),
                        resultSet.getString("sexo"),
                        resultSet.getString("email"),
                        resultSet.getString("nacionalidade")
                )
        );
    }
    //  Capturando valores pelo email ----------------------------------------------------------------------------------
    public Task findByEmail(String email) {
        String query = "SELECT * FROM dados_pessoais WHERE email = ?";

        return jdbcTemplate.queryForObject(query, new Object[]{email}, (resultSet, rowNum) ->
                new Task(
                        resultSet.getLong("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("idade"),
                        resultSet.getString("sexo"),
                        resultSet.getString("email"),
                        resultSet.getString("nacionalidade")
                )
        );
    }
    //  Capturando valores pela nacionalidade --------------------------------------------------------------------------
    public Task findByNacionalidade(String nacionalidade) {
        String query = "SELECT * FROM dados_pessoais WHERE nacionalidade = ?";

        return jdbcTemplate.queryForObject(query, new Object[]{nacionalidade}, (resultSet, rowNum) ->
                new Task(
                        resultSet.getLong("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("idade"),
                        resultSet.getString("sexo"),
                        resultSet.getString("email"),
                        resultSet.getString("nacionalidade")
                )
        );
    }
    // ------------------------------------------------------------------------------------

    @Override
    public Task save(Task task) {
        if (task.getId() != null) {
            String insertQuery = "INSERT INTO dados_pessoais (id, nome, idade, sexo, email, nacionalidade) VALUES (?, ?, ?, ?, ?, ?)";
            /*
            utilizada para executar operações de atualização no banco de dados usando o Spring JDBC. Essa função é
            comumente usada para operações que modificam os dados no banco, como inserções, atualizações ou exclusões.
             */
            jdbcTemplate.update(insertQuery, task.getId(), task.getNome(), task.getIdade(),  task.getSexo(),  task.getEmail(),  task.getNacionalidade());
        } else {
            String updateQuery = "UPDATE dados_pessoais SET nome = ?, idade = ?,sexo = ?,email = ?,nacionalidade = ? WHERE id = ?";
            jdbcTemplate.update(updateQuery, task.getId(), task.getNome(), task.getIdade(),  task.getSexo(),  task.getEmail(),  task.getNacionalidade());
        }
        return task;
    }
}