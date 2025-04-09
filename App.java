import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Desk mainDesk = new Desk();
        mainDesk.initalizeDeck();

        Desk playerDesk = new Desk();
        for(int i = 0; i < 2; i++)
        {
            Card card = mainDesk.getRandomCardFromDesk();
            playerDesk.addCard(card);
        }
        
        Ascii_new.outDesk(playerDesk.getDesk());
        String request = scanner.nextLine();

        while (true) {
            if (request.equals("more")) {
                Card card = mainDesk.getRandomCardFromDesk();
                playerDesk.addCard(card);
                Ascii_new.outDesk(playerDesk.getDesk());
            } else if (request.equals("quit")) {
                System.out.println("Game over");
                break;
            } else {
                System.out.println("Invalid input");
            }
            request = scanner.nextLine();
        }
    
    }
}