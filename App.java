public class App {
    public static void main(String[] args) {
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"diamonds", "hearts", "clubs", "spades"};
        
        Ascii_new ascii_new = new Ascii_new();
        
        String card = Randomizer.getRandom(cards);
        String suit = Randomizer.getRandom(suits);
        System.out.println(ascii_new.printCards_new(card, suit));

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


    }
}