public class Ascii_new {
    public static String printCards_new(Card card) {
        int number = card.number;
        Suit suit = card.suit;
        String suitSymbol = "";
        String color = "";
        String cardNumber = ""; 

        if (suit == Suit.diamonds || suit == Suit.hearts) {
            color = ConsoleColors.RED;
        }

        switch (suit) {
            case Suit.diamonds:
                suitSymbol = "♦";
                break;
            case Suit.hearts:
                suitSymbol = "♥";
                break;
            case Suit.clubs:
                suitSymbol = "♣";
                break;
            case Suit.spades:
                suitSymbol = "♠";
                break;
            default:
                break;
        }

        switch (number) {
            case 11:
                cardNumber = "J";
                break;
            case 12:
                cardNumber = "Q";
                break;
            case 13:
                cardNumber = "K";
                break;
            case 14:
                cardNumber = "A";
                break;
            default:
                cardNumber = number + "";
                break;
        }

        String cardLine;
        if (number == 10) {
            cardLine = "       ";
        } else {
            cardLine = "        ";
        }

        String cardOutput = ConsoleColors.WHITE_BACKGROUND_BRIGHT + " " + color + cardNumber + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + cardLine + " " + ConsoleColors.RESET + "\n" 
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "           " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "           " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "     " + color + suitSymbol + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "     " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "           " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "           " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + " " + cardLine + color + cardNumber + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT +  " " + ConsoleColors.RESET;
                

        return cardOutput;
    }
}