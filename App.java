import java.util.ArrayList;

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

        CardManager cardManager = new CardManager();

        cardManager.initalizeDeck();
        System.out.println(cardManager.getRandomCardFromDesk());
    }
}