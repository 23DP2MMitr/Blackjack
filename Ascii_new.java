import java.util.ArrayList;

public class Ascii_new {
    public static String printCards_new(Card card) {
        int number = card.number;
        Suit suit = card.suit;
        String suitSymbol;
        String color = "";
        String cardNumber; 

        if (suit == Suit.diamonds || suit == Suit.hearts) {
            color = ConsoleColors.RED;
        }

        suitSymbol = switch (suit) {
            case diamonds -> "♦";
            case hearts -> "♥";
            case clubs -> "♣";
            case spades -> "♠";
            default -> "";
        };

        cardNumber = switch (number) {
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 14 -> "A";
            default -> number + "";
        };

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

    public static void outDesk(ArrayList<Card> desk) {
        String cardLines = "";
        for (int i = 0; i < 7; i++) {
            for(int j = 0; j < desk.size(); j++)
            {
                cardLines = cardLines + printCards_new(desk.get(j)).split("\n")[i] + " ";
            }
            cardLines = cardLines + "\n";
        }
        System.out.println(cardLines);
    }
}