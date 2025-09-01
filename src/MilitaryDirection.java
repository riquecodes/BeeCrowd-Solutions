import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilitaryDirection {
    public static void main(String[] args) throws IOException {
        String[] directions = new String[] {"N", "L", "S", "O"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N < 1 || N > 1000)
                return;

            String command = br.readLine();
            String[] seq = command.split("");
            int index = 0;

            for (String commands : seq) {
                if (commands.equals("E")) {
                    index = index == 0 ? 3 : index - 1;
                    continue;
                }
                index = index == 3 ? 0 : index + 1;
            }
            System.out.println(directions[index]);
       }
    }
}