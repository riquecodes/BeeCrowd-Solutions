import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WebSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int clicksInFirstLink = t * 4;

        System.out.println(clicksInFirstLink);
    }
}
