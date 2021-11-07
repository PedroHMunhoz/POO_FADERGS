package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Lampada {
    
    // Variável para armazenar se a lâmpada está acesa ou não
    public boolean acesa;
    
    // Variável para armazenar a potência da lâmpada
    public int potencia;
    
    // Método que acende a lâmpada, marcando a variável acesa como true
    public void acender()
    {
        this.acesa = true;
    }
    
    // Método que apaga a lâmpada, marcando a variável acesa como false
    public void apagar() 
    {
        this.acesa = false;
    }    
    
    // Método que imprime a situação da lâmpada conforme o valor da propriade acesa
    public void informarSituacao() 
    {
        if(acesa){
            System.out.println("A luz está acesa.");
        }
        else
        {
            System.out.println("A luz está apagada.");
        }        
    }
    
    // Método que imprime a potência da lâmpada
     public void informarPotencia() 
    {
        System.out.println("A potência da lâmpada é " + this.potencia);
    }    
}
