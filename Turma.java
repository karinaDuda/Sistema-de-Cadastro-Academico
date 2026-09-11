public class Turma {
    // ========= Objeto turma =========
    public String nomeTurma;
    public String sala;
    public int professor;

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getProfessor() {
        return professor;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }

    public Turma(String nomeTurma, String sala, int professor) {
        this.nomeTurma = nomeTurma;
        this.sala = sala;
        this.professor = professor;
    }
}
