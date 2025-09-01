import java.util.*;

public class CardsOut {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int qntyCards = sc.nextInt();

        while (qntyCards != 0) {

            Queue<Integer> cards = new LinkedList<>();

            for (int i = 1; i <= qntyCards; i++) {
                cards.add(i);
            }

            StringBuilder discarded = new StringBuilder("Discarded cards: ");

            while (cards.size() > 1) {
                discarded.append(cards.poll());

                if (cards.size() > 1) {
                    discarded.append(", ");
                }
                cards.add(cards.poll());
            }
            System.out.println(discarded);
            System.out.println("Remaining card: " + cards.peek());
            qntyCards = sc.nextInt();
        }
    }
}
