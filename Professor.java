public class Professor {
    // ========= Objeto professor =========
    public String nome;
    public String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Professor(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }
}
