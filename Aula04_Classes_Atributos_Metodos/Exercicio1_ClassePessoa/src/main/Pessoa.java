package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Pessoa {
    
    // Variável para armazenar o nome da Pessoa criada
    public String nome;
    
    // Variável para armazenar a idade da Pessoa criada
    public int idade;
    
    // Este método imprime o nome que foi atribuído ao objeto instanciado
    public void dizerONome()
    {
        System.out.println("Olá, meu nome é " + this.nome + ".");
    }
    
    // Este método imprime a idade que foi atribuída ao objeto instanciado
    public void dizerAIdade() 
    {
        System.out.println("Olá, eu tenho " + this.idade + " anos.");
    }    
    
    // Este método soma +1 na idade atual do objeto instanciado
    public void fazerAniversario() 
    {
        this.idade++;
    }    
}
