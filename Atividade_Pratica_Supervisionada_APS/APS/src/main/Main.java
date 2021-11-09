package main;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Munhoz Costa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Classe scanner para leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Quantidade de alunos a serem cadastrados no Curso
        int quantidadeAlunos = 2;

        // Variável para a média da turma
        float mediaFinalTurma = 0;

        // Variável para o somatório das médias dos alunos e calculo da média final
        float mediaTurmaSoma = 0;

        // Título inicial
        System.out.println("========== Cadastro do Curso ==========");

        // Instancia um novo curso
        Curso curso = new Curso();

        // Lê o nome do Curso digitado
        System.out.println("Digite o nome do Curso:");
        curso.setNome(leitura.next());

        // Limpa o buffer de leitura
        leitura.nextLine();

        // Lê o horário do Curso digitado
        System.out.println("Horário do Curso:");
        curso.setHorario(leitura.next());

        // Limpa o buffer de leitura
        leitura.nextLine();

        // Título do Cadastro de Professores
        System.out.println("========== Cadastro do Professor ==========");

        // Instancia um novo objeto Professor
        Professor prof = new Professor();

        // Lê o nome do Professor digitado
        System.out.println("Digite o nome do Professor:");
        prof.setNome(leitura.next());

        // Limpa o buffer de leitura
        leitura.nextLine();

        // Lê o email do Professor digitado
        System.out.println("Digite o email do Professor:");
        prof.setEmail(leitura.next());

        // Limpa o buffer de leitura
        leitura.nextLine();

        // Lê o departamento do Professor digitado
        System.out.println("Digite o departamento do Professor:");
        prof.setDepartamento(leitura.next());

        // Limpa o buffer de leitura
        leitura.nextLine();

        // Seta o Professor recém cadastrado no Curso
        curso.setProfessor(prof);

        // Faz o loop para adicionar os alunos com suas notas 
        for (int i = 1; i <= quantidadeAlunos; i++) {
            // Instancia um novo Aluno
            Aluno aluno = new Aluno();

            // Lê a matrícula do Aluno digitado
            System.out.println("Digite a matrícula do Aluno (somente números):");
            aluno.setMatricula(leitura.nextInt());

            // Lê o nome do Aluno digitado
            System.out.println("Digite o nome do Aluno:");
            aluno.setNome(leitura.next());

            // Limpa o buffer de leitura
            leitura.nextLine();

            // Lê a Nota 1 do Aluno digitado
            System.out.println("Digite a Nota 1 do Aluno:");
            aluno.setNota1(leitura.nextFloat());

            // Lê a Nota 2 do Aluno digitado
            System.out.println("Digite a Nota 2 do Aluno:");
            aluno.setNota2(leitura.nextFloat());

            // Lê a Nota 3 do Aluno digitado
            System.out.println("Digite a Nota 3 do Aluno:");
            aluno.setNota3(leitura.nextFloat());

            // Lê a Nota 4 do Aluno digitado
            System.out.println("Digite a Nota 4 do Aluno:");
            aluno.setNota4(leitura.nextFloat());

            // Adiciona o Aluno cadastrado na Lista de Alunos do Curso
            curso.adicionarAluno(aluno);

            // Calcula a média do aluno, conforme suas notas
            float mediaAluno = aluno.calcularMedia();

            // Adiciona a média do aluno no somatório de médias
            mediaTurmaSoma += mediaAluno;
        }
        
        // Calcula a média final da turma conforme a quantidade de alunos
        mediaFinalTurma = mediaTurmaSoma / quantidadeAlunos;

        // Impressão dos resultados
        System.out.println("========== Resultados ==========");

        System.out.println("Curso: " + curso.getNome());
        System.out.println("Horário: " + curso.getHorario());
        System.out.println("Professor: " + curso.getProfessor().getNome());
        System.out.println("Departamento: " + curso.getProfessor().getDepartamento());
        System.out.println("Email do Professor: " + curso.getProfessor().getEmail());
        System.out.println("Média Final da Turma: " + mediaFinalTurma);
        System.out.println("");

        System.out.println("========== Informações dos Alunos ==========");

        for (Aluno aluno : curso.getListaAlunos()) {
            // Calcula a média do aluno, conforme suas notas
            float mediaAluno = aluno.calcularMedia();

            // Seta a variável indicando se o aluno foi aprovado ou não
            boolean alunoAprovado = mediaAluno >= 7;

            // Imprime as informações do aluno
            System.out.println("Matrícula do Aluno: " + aluno.getMatricula());
            System.out.println("Nome do Aluno: " + aluno.getNome());
            System.out.println("Nota 1: " + aluno.getNota1());
            System.out.println("Nota 2: " + aluno.getNota2());
            System.out.println("Nota 3: " + aluno.getNota3());
            System.out.println("Nota 4: " + aluno.getNota4());
            System.out.println("Média do Aluno: " + mediaAluno);

            // Imprime a situação Aprovado/Reprovado do aluno
            if (alunoAprovado) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
            System.out.println("");
            System.out.println("##############################");
            System.out.println("");
        }
    }
}
