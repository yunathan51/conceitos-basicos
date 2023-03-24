import java.io.*;

import java.util.*;




public class main {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int entradaa = entrada.nextInt();
        int valor = 0;
        int contador = 0;

        while (contador <= 9 && contador >= 0) {
            contador++;
            valor = entradaa * contador;

        System.out.println(entradaa + " x " + contador + " = " + valor);

        }


    }
}
