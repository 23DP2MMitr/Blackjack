public class App {
    public static void main(String[] args) {
        // System.out.println(ConsoleColors.RED + "Hi eptiome!");
        // System.out.println(ConsoleColors.YELLOW + "Hi player!");
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    
        String card = Cards.getRandom(cards);
        System.out.println(card);    

        System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "Hello, World!" + ConsoleColors.RESET);

    }
}