import java.util.Scanner;

public class Cadastro {
    // ========= Cadastro pelo terminal =========
    public static void main(String[] args) {
        // apresenta o menu
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        // laço de repetição para realzar vários cadastros
        while (escolha != 4) {
            System.out.println("====== Menu ======");
            System.out.println("1 - Cadastro professor\n2 - Cadastro turma\n3 - Cadastro aluno\n4 - Sair");
            escolha = scanner.nextInt();
            // bloco try para interceptar erros
            try {
                if (escolha == 1) {
                    scanner.nextLine();
                    System.out.println("Nome: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.println("Curso: ");
                    String curso = scanner.nextLine();
                    // cria um objeto professor com os dados informados pelo utilizador
                    Professor professor = new Professor(nomeProfessor, curso);
                    // chama a classe responsável por salvar e o método que salva o professor
                    SalvarDados.salvarProfessor(professor);
                } else if (escolha == 2) {
                    scanner.nextLine();
                    System.out.println("Nome da turma: ");
                    String nomeTurma = scanner.nextLine();
                    System.out.println("Sala: ");
                    String sala = scanner.next();
                    System.out.println("Id professor responsavel: ");
                    int idProf = scanner.nextInt();
                    // o mesmo por aqui
                    Turma turma = new Turma(nomeTurma, sala, idProf);
                    SalvarDados.salvarTurma(turma);
                } else if (escolha == 3) {
                    scanner.nextLine();
                    System.out.println("Nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.println("Matricula do aluno: ");
                    String matricula = scanner.next();
                    System.out.println("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.println("ID da turma: ");
                    int turmaId = scanner.nextInt();
                    // e aqui tembém
                    Aluno aluno = new Aluno(nomeAluno, matricula, idade, turmaId);
                    SalvarDados.salvarAluno(aluno);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
}