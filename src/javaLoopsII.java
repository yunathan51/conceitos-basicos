import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j<n; j++) {
                a += b;
                    System.out.println("  ");

                if (j >0) {
                    System.out.println("  ");
                }
                System.out.println(a);
                b = b * 2;

            }
            System.out.println("\n");

        }
        in.close();
    }
}