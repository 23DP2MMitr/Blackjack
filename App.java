import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // String card1 = ascii_new.printCards_new("A", "hearts");
        // String card2 = ascii_new.printCards_new("10", "diamonds");
        // String card3 = ascii_new.printCards_new("K", "clubs");
        // String card4 = ascii_new.printCards_new("Q", "spades");

        // String[] cardLines1 = card1.split("\n");
        // String[] cardLines2 = card2.split("\n");
        // String[] cardLines3 = card3.split("\n");
        // String[] cardLines4 = card4.split("\n");

        // for (int i = 0; i < cardLines1.length; i++) {
        //     System.out.println(cardLines1[i] + " " + cardLines2[i] + " " + cardLines3[i] + " " + cardLines4[i]);
        // }
        // System.out.println(cardManager.getRandomCardFromDesk());
        Scanner scanner = new Scanner(System.in);

        CardManager cardManager = new CardManager();
        cardManager.initalizeDeck();

        String card1 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
        String card2 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());

        for (int i = 0; i < card1.split("\n").length; i++) {
            System.out.println(card1.split("\n")[i] + " " + card2.split("\n")[i]);
        }

        String request = scanner.nextLine();
        // System.out.println(card1.split("\n")[0] + " " + card2.split("\n")[0]);

        if (request.equals("more")) {
            System.out.println(ConsoleColors.CLEAR);
            String card3 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
            String card4 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());

            for (int i = 0; i < card1.split("\n").length; i++) {
                System.out.println(card1.split("\n")[i] + " " + card2.split("\n")[i] + " " + card3.split("\n")[i] + " " + card4.split("\n")[i]);
            }
    
        
        }
        
        
    
    }
}