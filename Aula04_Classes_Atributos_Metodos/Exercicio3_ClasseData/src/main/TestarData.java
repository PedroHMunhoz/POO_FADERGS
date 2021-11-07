package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class TestarData {

    /**
     * Exercícios sobre Classes 
     * Exercício 3 - Crie uma classe Data que obedeça a descrição apresentada na 
     * representação abaixo.
     * 
     * - Possua os atributos dia, mês e ano. 
     * - E os métodos: escreverAData, escreverOMes.
     * 
     * - O método escreverAData deve mostrar a data na tela no formato DD/MM/AAA
     * - O método escreverOMes deve mostrar o nome do mês. Por exemplo,
     * para mês 2, escrever “Fevereiro”.
     * 
     * - Crie também uma classe TestarData que possua o método main que realize 
     * as seguintes operações:
        • Instancie um objeto do tipo Data.
        • Atribua um valor para o atributo dia
        • Atribua um valor para o atributo mes
        • Atribua um valor para o atributo ano
        • Chame o método escreverAData
        • Chame o método escreverOMes
        • Altere o valor do atributo mes
        • Chame o método escreverAData
        • Chame o método escreverOMes
     */
    public static void main(String[] args) {        
        // Instancia um novo objeto do tipo Dat
        Data data = new Data();
        
        // Atribui 5 a propriedade dia
        data.dia = 5;
        
        // Atribui 2 a propriedade mes
        data.mes = 2;
        
        // Atribui 2021 a propriedade ano
        data.ano = 2021;
        
        // Escreve a data com os dados informados, no formato DD/MM/AAAA
        data.escreverAData();
        
        // Escreve o nome do mês baseado no valor informado no objeto
        data.escreverOMes();        
        
        // Troca o mês para 10
        data.mes = 10;
        
        // Escreve a data com os dados informados, no formato DD/MM/AAAA
        data.escreverAData();
        
        // Escreve o nome do mês baseado no valor informado no objeto
        data.escreverOMes();
    }    
}
