package main;

/**
 * @author Pedro Henrique Munhoz Costa
 */
public class Data {

    public int dia;
    public int mes;
    public int ano;

    public void escreverAData() {
        String diaFormatado = "";
        String mesFormatado= "";
        
        // Formatação para adicionar o 0 na frente do número do dia, caso ele seja
        // menor que 10
        if(this.dia < 10){
            diaFormatado = "0" + this.dia;
        }
        
        // Formatação para adicionar o 0 na frente do número do mês, caso ele seja
        // menor que 10
        if(this.mes < 10){
            mesFormatado = "0" + this.mes;
        }
        
        System.out.println("A data é " + (!diaFormatado.equals("") ? diaFormatado : this.dia) 
                + "/" +(!mesFormatado.equals("") ? mesFormatado : this.mes) + "/" + this.ano);
    }

    public void escreverOMes() {
        switch (this.mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido! Deve estar entre 1 e 12.");
                break;
        }
    }
}
