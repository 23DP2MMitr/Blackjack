public class Ascii_new {
    public String printCards_new(String card, String suit) {
        String suitSymbol = "";
        String color = "";

        if (suit == "diamonds" || suit == "hearts") {
            color = ConsoleColors.RED;
        }

        if (suit == "diamonds") {
            suitSymbol = "♦";
        } else if (suit == "hearts") {
            suitSymbol = "♥";
        } else if (suit == "clubs") {
            suitSymbol = "♣";
        } else if (suit == "spades") {
            suitSymbol = "♠";
        }

        String cardLine;
        if (card == "10") {
            cardLine = "       ";
        } else {
            cardLine = "        ";
        }

        String cardOutput = ConsoleColors.WHITE_BACKGROUND_BRIGHT + "┌─────────┐" + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│" + color + card + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + cardLine + "│" + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│         │" + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│    " + color + suitSymbol + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "    │" + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│         │" + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│" + cardLine + color + card + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT +  "│" + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "└─────────┘" + ConsoleColors.RESET;

        return cardOutput;
    }
}