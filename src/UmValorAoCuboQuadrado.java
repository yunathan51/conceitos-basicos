import java.util.Scanner;

public class UmValorAoCuboQuadrado {

    public static void main(String[] args) {

        Scanner potenciacao = new Scanner(System.in);


        System.out.println("digite o valor que sera feito a equação ao quadrado e ao cubo");
        double valor = potenciacao.nextInt();


        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);
        System.out.println("Valor ao quadrado " + quadrado + "\n" + "Valor cubo " + cubo);


        potenciacao.close();
    }
}
