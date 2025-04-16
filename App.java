import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Desk mainDesk = new Desk();
        mainDesk.initalizeDeck();

        Desk playerDesk = new Desk();
        for(int i = 0; i < 2; i++) {
            Card card = mainDesk.getRandomCardFromDesk();
            playerDesk.addCard(card);
        }
        
        Ascii_new.outDesk(playerDesk.getDesk());
        String request = scanner.nextLine();

        while (true) {
            switch (request) {
                case "more" -> {
                    int score = 0;
                    Card card = mainDesk.getRandomCardFromDesk();
                    playerDesk.addCard(card);
                    Ascii_new.outDesk(playerDesk.getDesk());
                    for (Card c : playerDesk.getDesk()) {
                        if (c.number > 10) {
                            score += 10;
                        } else if (c.number == 1) {
                            score += 11;
                        } else {
                            score += c.number;
                        }
                    }
                    System.out.println("Your score: " + score);
                    if (score > 21) {
                        System.out.println("You lose");
                        return;
                    } else if (score == 21) {
                        System.out.println("You win");
                        return;
                    }
                }
                case "quit" -> {
                    System.out.println("Game over");
                    return;
                }
                default -> System.out.println("Invalid input");
            }
            request = scanner.nextLine();
        }
    }
}