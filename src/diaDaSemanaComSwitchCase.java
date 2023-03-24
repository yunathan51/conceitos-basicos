import java.util.Scanner;

public class diaDaSemanaComSwitchCase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String dia = "";

        while (!dia.equalsIgnoreCase("fim")) {

            System.out.println("Informe o dia da semana (ou digite fim para sair) ");
            dia = entrada.nextLine().toLowerCase();
                switch (dia) {
                    case "segunda":
                        System.out.println(" |DIA 01| ");
                        break;
                    case "terca":
                        System.out.println(" |DIA 02| ");
                        break;
                    case "quarta":
                        System.out.println(" |DIA 03| ");
                        break;
                    case "quinta":
                        System.out.println(" |DIA 04| ");
                        break;
                    case "sexta":
                        System.out.println(" |DIA 05| ");
                        break;
                    case "sabado":
                        System.out.println(" |DIA 06| ");
                        break;
                    case "domingo":
                        System.out.println(" |DIA 07| ");
                        break;
                    case "fim":
                        System.out.println(" # ENCERRANDO PROGRAMA # ");
                        break;
                    default:
                        System.out.println("** Dia invalido!! Digite novamente **");
                }













        }
    }
}
