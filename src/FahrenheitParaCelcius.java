import java.util.Scanner;

public class FahrenheitParaCelcius {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit a ser convertida: ");
        int fah = usuario.nextInt();
        usuario.close();

        double logica = (fah - 32) * 5 / 9;
        System.out.println("\n" + "a temperatura é: " + logica + " Celcius");
    }
}
