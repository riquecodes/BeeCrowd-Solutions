import java.io.IOException;
import java.util.Scanner;

public class NlongoniaDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rep = scan.nextInt();

        while (rep != 0) {
            int xDiv = scan.nextInt();
            int yDiv = scan.nextInt();

            for (int i = 0; i < rep; i++) {
                int xP = scan.nextInt();
                int yP = scan.nextInt();

                if (xP == xDiv  || yP == yDiv) {
                    System.out.println("divisa");
                }
                else if (xP > xDiv && yP > yDiv) {
                    System.out.println("NE");
                }
                else if (xP > xDiv && yP < yDiv) {
                    System.out.println("SE");
                }
                else if (xP < xDiv && yP > yDiv) {
                    System.out.println("NO");
                }
                else {
                    System.out.println("SO");
                }
            }
            rep = scan.nextInt();
        }
    }
}