    import java.io.IOException;
    import java.util.Scanner;

    public class AlarmClock {
        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);

            while (true) {
                int h1 = scan.nextInt();
                int m1 = scan.nextInt();
                int h2 = scan.nextInt();
                int m2 = scan.nextInt();

                if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
                    return;
                }

                int minutosTotais = (h1 * 60) + m1;
                int minutosAlarme = (h2 * 60) + m2;

                if (minutosTotais > minutosAlarme) {
                    int minutosDormir = (1440 - minutosTotais) + minutosAlarme;
                    System.out.println(minutosDormir);
                } else {
                    int minutosDormir = minutosAlarme - minutosTotais;
                    System.out.println(minutosDormir);
                }

            }

        }

    }

