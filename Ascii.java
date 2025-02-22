public class Ascii {
    public void printCard(String card, String suit) {
        System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "┌─────────┐" + ConsoleColors.RESET); // top
        if (suit == "diamonds" || suit == "hearts"){
            if (card == "10"){
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│" + ConsoleColors.RED + card + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "       │" + ConsoleColors.RESET); // rank_line_left
            } else {
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│" + ConsoleColors.RED + card + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "        │" + ConsoleColors.RESET); // rank_line_left
            }
        } else {
            if (card == "10"){
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +  "│" + card + "       │" + ConsoleColors.RESET); // rank_line_left
            } else {
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +  "│" + card + "        │" + ConsoleColors.RESET); // rank_line_left
            }
        }
        System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│         │" + ConsoleColors.RESET); // side
        if (suit == "diamonds"){
            System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│    " + ConsoleColors.RED + "♦" + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "    │" + ConsoleColors.RESET); // suit_line
        } else if (suit == "hearts"){
            System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│    " + ConsoleColors.RED + "♥" + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "    │" + ConsoleColors.RESET); // suit_line
        } else if (suit == "clubs"){
            System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│    " + "♣" + "    │" + ConsoleColors.RESET); // suit_line
        } else if (suit == "spades"){
            System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│    " + "♠" + "    │" + ConsoleColors.RESET); // suit_line
        }
        System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│         │" + ConsoleColors.RESET); // side

        if (suit == "diamonds" || suit == "hearts"){
            if (card == "10"){
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│       " + ConsoleColors.RED + card + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│" + ConsoleColors.RESET); // rank_line_left
            } else {
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│        " + ConsoleColors.RED + card + ConsoleColors.RESET + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "│" + ConsoleColors.RESET); // rank_line_left
            }
        } else {
            if (card == "10"){
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +  "│       " + card + "│" + ConsoleColors.RESET); // rank_line_left
            } else {
                System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +  "│        " + card + "│" + ConsoleColors.RESET); // rank_line_left
            }
        }

        System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "└─────────┘" + ConsoleColors.RESET);
    }
}