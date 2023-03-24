import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        for (i = 1; scanner.hasNext(); i++) ;
            System.out.println(i + " " + scanner.nextLine());


    }
}
