import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalvarDados {
    // recebe um objeto do tipo professor e passa para o PostgreSQL por meio de parametros
    public static void salvarProfessor(Professor professor) {
        String sql = "INSERT INTO professores (nome_professor, curso)" +
                "VALUES (?, ?)";
        // obtem a conexao antes de passar os valores
        try (Connection conexao = ConexaoComBD.obterConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getCurso());
            // executa a atualização no BD
            stmt.executeUpdate();
            System.out.println("Professor(a) salvo(a) com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // mesmoo processo para o objeto turma
    public static void salvarTurma(Turma turma) {
        String sql = "INSERT INTO turmas (nome_turma, sala, professor_id)" +
                "VALUES (?, ?, ?)";
        try (Connection conexao = ConexaoComBD.obterConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, turma.getNomeTurma());
            stmt.setString(2, turma.getSala());
            stmt.setInt(3, turma.getProfessor());

            stmt.executeUpdate();
            System.out.println("Turma salva com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // e objeto aluno
    public static void salvarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos (nome_aluno, matricula, idade, turma_id)" +
                "VALUES (?, ?, ?, ?)";
        try (Connection conexao = ConexaoComBD.obterConexao(); PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getMatricula());
            stmt.setInt(3, aluno.getIdade());
            stmt.setInt(4, aluno.getTurmaId());

            stmt.executeUpdate();
            System.out.println("Aluno(a) salvo(a) com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
