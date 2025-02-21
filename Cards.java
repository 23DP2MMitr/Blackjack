import java.util.Random;

public class Cards {
    public static String getRandom(String[] cards) {
        Random random = new Random();
        int rnd = random.nextInt(cards.length);
    return cards[rnd];
    }
}
