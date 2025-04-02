import java.util.Scanner;

public class Add_card {
    Scanner scanner = new Scanner(System.in);
    CardManager cardManager = new CardManager();

    String card1 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card2 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card3 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card4 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card5 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card6 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card7 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card8 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card9 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card10 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());
    String card11 = Ascii_new.printCards_new(cardManager.getRandomCardFromDesk());

    String request = scanner.nextLine();

//     if (request.equals("more")) {
//         System.out.println(ConsoleColors.CLEAR);

//         for (int i = 0; i < card1.split("\n").length; i++) {
//             System.out.println(card1.split("\n")[i] + " " + card2.split("\n")[i] + " " + card3.split("\n")[i];
//         }
//         String request = scanner.nextLine();
//     }
//         if (request.equals("more")) {
//             System.out.println(ConsoleColors.CLEAR);
    
//             for (int i = 0; i < card1.split("\n").length; i++) {
//                 System.out.println(card1.split("\n")[i] + " " + card2.split("\n")[i] + " " + card3.split("\n")[i];
//             }
//             if (request.equals("more")) {
//                 System.out.println(ConsoleColors.CLEAR);
        
//                 for (int i = 0; i < card1.split("\n").length; i++) {
//                     System.out.println(card1.split("\n")[i] + " " + card2.split("\n")[i] + " " + card3.split("\n")[i];
//                 }
//                 if (request.equals("more")) {
//                     System.out.println(ConsoleColors.CLEAR);
            
//                     for (int i = 0; i < card1.split("\n").length; i++) {
//                         System.out.println(card1.split("\n")[i] + " " + card2.split("\n")[i] + " " + card3.split("\n")[i];
//                     }
//                 }
//     }
// }

}