import java.util.ArrayList;
import java.util.Random;

public class CardManager {
    private ArrayList<Card> deck = new ArrayList<Card>();
    private Random random = new Random();

    public void initalizeDeck()
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 2; j < 15; j++)
            {
                Card card = new Card();
                card.number = j;
                switch (i)
                {
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

        // System.out.println(deck.toString());
    }

    public Card getRandomCardFromDesk() {
        int cardIndex = random.nextInt(deck.size());
        Card card = deck.get(cardIndex);
        deck.remove(cardIndex);
        return card;
    }
}