package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class TestarPessoa {

    /**
     * Exercícios sobre Classes 
     * Exercício 1 - Crie uma classe Pessoa que obedeça a descrição apresentada 
     * na representação abaixo. 
     * - Possua os atributos nome e idade. 
     * - E os métodos: dizerONome, dizerAIdad e fazerAniversario. 
     * 
     * – O método dizerONome deve escrever na tela a 
     * mensagem: “Olá, meu nome é ”, e o valor do atributo nome. 
     * 
     * – O método dizerAIdade deve escrever na tela a
     * mensagem: “Olá, eu tenho X anos”, onde X é o valor do atributo idade. 
     * 
     * – O método fazerAniversario deve adicionar 1 à idade da Pessoa 
     * 
     * – Crie também uma classe TestarPessoa que possua um método main que 
     * realize as seguintes operações:
     *  • Instancie um objeto do tipo Pessoa.
        • Atribua o seu nome ao atributo nome.
        • Atribua a sua idade ao atributo idade.
        • Chame o método dizerONome
        • Chame o método dizerAIdade
        • Chame o método fazerAniversario
        • Chame o método dizerAIdade
     */
    public static void main(String[] args) {

        // Instancia um novo objeto do tipo Pessoa
        Pessoa pessoa = new Pessoa();

        // Atribui o nome ao objeto instanciado
        pessoa.nome = "Pedro Henrique Munhoz Costa";

        // Atribui a idade ao objeto instanciado
        pessoa.idade = 29;

        // Chama o método que mostra o nome da pessoa que foi atribuído ao objeto
        pessoa.dizerONome();

        // Chama o método que mostra a idade da pessoa que foi atribuído ao objeto
        pessoa.dizerAIdade();

        // Chama o método que incrementa em +1 a idade da pessoa
        pessoa.fazerAniversario();

        // Chama o método que mostra a idade da pessoa que foi atribuído ao objeto,
        // após ela fazer aniversário
        pessoa.dizerAIdade();
    }
}
