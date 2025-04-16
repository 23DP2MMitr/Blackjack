import java.util.ArrayList;
import java.util.Random;

public class Desk {
    private final ArrayList<Card> deck = new ArrayList<>();
    private final Random random = new Random();

    public void initalizeDeck() {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 2; j < 15; j++)
            {
                Card card = new Card();
                card.number = j;
                switch (i) {
                    case 0:
                        card.suit = Suit.hearts;
                        break;
                    case 1:
                        card.suit = Suit.diamonds;
                        break;
                    case 2:
                        card.suit = Suit.clubs;
                        break;
                    case 3:
                        card.suit = Suit.spades;
                        break;
                    default:
                }
                deck.add(card);
            }
        }
    }

    public Card getRandomCardFromDesk() {
        int cardIndex = random.nextInt(deck.size());
        Card card = deck.get(cardIndex);
        deck.remove(cardIndex);
        return card;
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public ArrayList<Card> getDesk() {
        return deck;
    }
}