import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaIdentify {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int teaType = Integer.parseInt(br.readLine());
        String response = br.readLine();
        String[] responseArray = response.split(" ");
        int winners = 0;

        for (String s : responseArray) {
            if (s.equals(String.valueOf(teaType))) {
                winners++;
            }
        }
        System.out.println(winners);
    }
}
