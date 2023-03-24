import java.util.Scanner;

public class diaDaSemana {

    public static void main(String[] args) {
        /*============================*/
        /* CODIGO BROKEN NEM TENTAKKK */
        /* CODIGO BROKEN NEM TENTAKKK */
        /* CODIGO BROKEN NEM TENTAKKK */
        /* CODIGO BROKEN NEM TENTAKKK */
        /*============================*/

        Scanner entrada = new Scanner(System.in);

            int a =999;
                for(int i=0;i<a;i++) {

                try {
                    String dia = entrada.nextLine();
                    dia = dia.toLowerCase();
                        System.out.println(dia + " é:");
                            if("segunda".equalsIgnoreCase(dia)){System.out.println("* DIA 1");}
                                if("terca".equalsIgnoreCase(dia)){System.out.println("* DIA 2");}
                                    if("quarta".equalsIgnoreCase(dia)){System.out.println("* DIA 3");}
                                        if("quinta".equalsIgnoreCase(dia)){System.out.println("* DIA 4");}
                                            if("sexta".equalsIgnoreCase(dia)){System.out.println("* DIA 5");}
                                                if("sabado".equalsIgnoreCase(dia)){System.out.println("* DIA 6");}
                                                    if("domingo".equalsIgnoreCase(dia)){System.out.println("* DIA 7");}

                }
                catch (Exception e){
                    System.out.println("INFORME UM DIA VALIDO");
                }
                }
    }
}
