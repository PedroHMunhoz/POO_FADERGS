package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class TestarLampada {
    /**
     * Exercícios sobre Classes 
     * Exercício 2 - Crie uma classe Lampada que obedeça a descrição apresentada
     * na representação abaixo.
     * 
     * - Possua os atributos acesa e potencia. 
     * - E os métodos: acender, apagar, informarSituacao e informarPotencia.
     * 
     * – O método acender deve alterar o atributo acesa para true.
     * 
     * – O método apagar deve alterar o atributo acesa para false
     * 
     * – O método informarSituacao deve informar a mensagem “A luz está acesa” 
     * caso o atributo acesa seja igual a true e a mensagem “A luz está apagada”
     * caso o atributo acesa seja igual a false.
     * 
     * – O método informarPotencia deve escrever a mensagem “A potência da 
     * lâmpara é X”, onde X é o valor do atribuito potência.
     * 
     * – Crie também uma classe TestarLampada que possua um método main que 
     * realize as seguintes operações:
        • Instancie um objeto do tipo Lampada.
        • Chame o método acender.
        • Chame o método informarSituacao.
        • Chame o método apagar
        • Chame o método informarSituacao
        • Chame o método informarPotencia
     */
    public static void main(String[] args) {

        // Instancia um novo objeto do tipo Lampada
        Lampada lampada = new Lampada();

        // Chama o método que acende a lâmpada
        lampada.acender();

        // Chama o método que informa a situação atual da lâmpada
        lampada.informarSituacao();

        // Chama o método que apaga a lâmpada
        lampada.apagar();

        // Chama o método que informa a situação atual da lâmpada
        lampada.informarSituacao();

        // Chama o método que informa a potência atual da lâmpada
        lampada.informarPotencia();
    }
}
