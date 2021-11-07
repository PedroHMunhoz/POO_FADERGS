package main;

import java.util.Scanner;
/**
 *
 * @author Pedro Henrique Munhoz Costa
 */
public class Aluno {

    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private static int auxMatricula;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.matricula = this.gerarMatricula();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public int getAuxMatricula() {
        return auxMatricula;
    }

    public void setAuxMatricula(int auxMatricula) {
        this.auxMatricula = auxMatricula;
    }

    private static int gerarMatricula() {        
        
        // Incrementa o valor da variável estática e retorna o novo valor
        return ++auxMatricula;
    }

    public void exibirDados() {

        // Calcula a média do aluno, passando as notas como parâmetro
        float mediaAluno = this.calcularMedia(this.nota1, this.nota2, this.nota3);
        
        // Variável para a mensagem de situação
        String situacao;

        // Se o método retornar TRUE, o aluno estará aprovado
        if (verificarAprovacao(mediaAluno)) {
            situacao = "Aprovado";
        } else // Senão, estará reprovado
        {
            situacao = "Reprovado";
        }
        
        // Imprime na tela os dados do aluno criado
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("##### NOTAS #####");
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Nota 3: " + this.nota3);
        System.out.println("Média: " + mediaAluno);
        System.out.println("Situação: " + situacao);
    }

    public void lancarNotas() {
        // Scanner para leitura das notas informadas pelo usuário
        Scanner leituraNotas =  new Scanner(System.in);                
        
        // Lê as três notas pra dentro de suas respectivas variáveis
        System.out.println("Informe a nota 1: ");
        this.nota1 = leituraNotas.nextFloat();

        System.out.println("Informe a nota 2: ");
        this.nota2 = leituraNotas.nextFloat();
        
        System.out.println("Informe a nota 3: ");
        this.nota3 = leituraNotas.nextFloat();
        
        // Mensagem de sucesso, conforme o enunciado
        System.out.println("Notas lançadas com sucesso!");
    }

    private float calcularMedia(float nota1, float nota2, float nota3) {
        // Soma os 3 valores e divide por 3, média aritmética simples
        return (nota1 + nota2 + nota3) / 3;        
    }

    private boolean verificarAprovacao(float media) {
        // Se a media for maior ou igual a 7, vai retornar TRUE, logo o aluno
        // está Aprovado. Se não, retornará FALSE, logo está Reprovado.
        return media >= 7;
    }
}
