enum Suit
{
    heart,
    diamond,
    clubs,
    spades
}

public class Card {
    public int number;
    public Suit suit;

    public String toString()
    {
        return number + " of " + suit;
    }
}
