enum Suit
{
    hearts,
    diamonds,
    clubs,
    spades
}

public class Card {
    public int number;
    public Suit suit;

    @Override
    public String toString()
    {
        return number + " " + suit;
    }

    public String NumberReturn() {
        return number + "";
    }
}
