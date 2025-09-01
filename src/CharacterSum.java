import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int rep = Integer.parseInt(bf.readLine());

        for (int i = 0; i < rep; i++) {
            String seq = bf.readLine();

            int num1 = Integer.parseInt(String.valueOf(seq.charAt(0)));
            int num2 = Integer.parseInt(String.valueOf(seq.charAt(2)));

            if (Integer.valueOf(num1).equals(num2)) {
                int multi = num1 * num2;
                System.out.println(multi);
                continue;
            }

            if (Character.isUpperCase(seq.charAt(1))) {
                int sub = num2 - num1;
                System.out.println(sub);
                continue;
            }

            if (Character.isLowerCase(seq.charAt(1))) {
                int sum = num1 + num2;
                System.out.println(sum);
            }
        }
    }
}