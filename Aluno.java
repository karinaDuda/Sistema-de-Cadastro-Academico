public class Aluno {
    // ========= Objeto aluno =========
    public String nome;
    public String matricula;
    public int idade;
    public int turmaId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(int turmaId) {
        this.turmaId = turmaId;
    }

    public Aluno(String nome, String matricula, int idade, int turmaId) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.turmaId = turmaId;
    }
}

