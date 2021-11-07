package main;

import java.util.Scanner;
/**
 *
 * @author Pedro Henrique Munhoz Costa
 */
public class TestarAluno {

    public static void main(String[] args) {
        // Classe scanner para leitura dos dados
        Scanner leitura = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.println("Informe o nome do aluno: ");
        
        // Instancia um objeto Aluno, passando o nome para o construtor
        Aluno aluno = new Aluno(leitura.next());

        // Limpa o buffer de leitura
        leitura.nextLine();
        
        // Chama o método que pede o lançamento das notas
        aluno.lancarNotas();
        
        // Chama o método que faz a exibição dos dados do objeto criado acima
        aluno.exibirDados();
        
        // Solicita o nome do aluno
        System.out.println("Informe o nome do aluno: ");
        
        // Instancia um segundo objeto aluno
        aluno = new Aluno(leitura.next());

        // Limpa o buffer de leitura
        leitura.nextLine();
        
        // Chama o método que pede o lançamento das notas
        aluno.lancarNotas();
        
        // Chama o método que faz a exibição dos dados do objeto criado acima
        aluno.exibirDados();
    }
}
