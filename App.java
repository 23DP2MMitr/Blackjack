public class App {
    public static void main(String[] args) {
        // System.out.println(ConsoleColors.RED + ConsoleColors.WHITE_BACKGROUND_BRIGHT + "Hello, World!" + ConsoleColors.RESET);
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    
        // String card = Cards.getRandom(cards);
        // System.out.println(card);    

        // System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "Hello, World!" + ConsoleColors.RESET);
        // String diamonds = "♦";
        // String clubs = "♣";
        // String hearts = "♥";
        // String spades = "♠";

        
        Ascii ascii = new Ascii();
        ascii.printCard("10", "diamonds");
        ascii.printCard("10", "hearts");
        ascii.printCard("10", "clubs");
        ascii.printCard("10", "spades");
        ascii.printCard("2", "diamonds");
        ascii.printCard("2", "hearts");
        ascii.printCard("2", "clubs");
        ascii.printCard("2", "spades");
        ascii.printCard("A", "clubs");
    }
}