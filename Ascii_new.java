public class Ascii_new {
    public String printCards_new(String number, String suit) {
        String suitSymbol = "";
        String color = "";

        if (suit == "diamonds" || suit == "hearts") {
            color = ConsoleColors.RED;
        }

        switch (suit) {
            case "diamonds":
                suitSymbol = "♦";
                break;
            case "hearts":
                suitSymbol = "♥";
                break;
            case "clubs":
                suitSymbol = "♣";
                break;
            case "spades":
                suitSymbol = "♠";
                break;
            default:
                break;
        }

        String cardLine;
        if (number == "10") {
            cardLine = "       ";
        } else {
            cardLine = "        ";
        }

        String cardOutput = ConsoleColors.WHITE_BACKGROUND_BRIGHT + " " + color + number + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + cardLine + " " + ConsoleColors.RESET + "\n" 
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "           " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "           " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "     " + color + suitSymbol + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "     " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "           " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "           " + ConsoleColors.RESET + "\n"
                + ConsoleColors.WHITE_BACKGROUND_BRIGHT + " " + cardLine + color + number + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT +  " " + ConsoleColors.RESET;
                

        return cardOutput;
    }
}