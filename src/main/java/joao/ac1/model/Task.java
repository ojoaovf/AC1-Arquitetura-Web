package joao.ac1.model;


public class Task {
    private Long id;
    private String nome;
    private String idade;
    private String sexo;
    private String email;
    private String nacionalidade;

    public Task(Long id, String nome, String idade, String sexo, String email, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.nacionalidade = nacionalidade;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

}