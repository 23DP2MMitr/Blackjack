import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Desk mainDesk = new Desk();
        mainDesk.initalizeDeck();

        Desk playerDesk = new Desk();
        Desk dealerDesk = new Desk();
        
        for(int i = 0; i < 2; i++) {
            Card card = mainDesk.getRandomCardFromDesk();
            playerDesk.addCard(card);
            card = mainDesk.getRandomCardFromDesk();
            dealerDesk.addCard(card);
        }
        
        while (true) {
            System.out.print(ConsoleColors.CLEAR);
            System.out.println("Dealer's cards: (Score: " + calculateScore(dealerDesk) + ")");
            Ascii_new.outDesk(dealerDesk.getDesk());
            System.out.println("\nYour cards: (Score: " + calculateScore(playerDesk) + ")");
            Ascii_new.outDesk(playerDesk.getDesk());
            System.out.println("\nCommands: 'more' - get another card, 'stand' - end your turn, 'quit' - end game");
            String request = scanner.nextLine();

            switch (request) {
                case "more" -> {
                    int playerScore = calculateScore(playerDesk);
                    Card card = mainDesk.getRandomCardFromDesk();
                    playerDesk.addCard(card);
                    playerScore = calculateScore(playerDesk);
                    
                    if (playerScore > 21) {
                        System.out.print(ConsoleColors.CLEAR);
                        System.out.println("Dealer's cards: (Score: " + calculateScore(dealerDesk) + ")");
                        Ascii_new.outDesk(dealerDesk.getDesk());
                        System.out.println("\nYour cards: (Score: " + playerScore + ")");
                        Ascii_new.outDesk(playerDesk.getDesk());
                        System.out.println("\nYou bust! Dealer wins.");
                        return;
                    } else if (playerScore == 21) {
                        System.out.print(ConsoleColors.CLEAR);
                        System.out.println("Dealer's cards: (Score: " + calculateScore(dealerDesk) + ")");
                        Ascii_new.outDesk(dealerDesk.getDesk());
                        System.out.println("\nYour cards: (Score: " + playerScore + ")");
                        Ascii_new.outDesk(playerDesk.getDesk());
                        System.out.println("\nBlackjack! You win!");
                        return;
                    }
                }
                case "stand" -> {
                    int playerScore = calculateScore(playerDesk);
                    System.out.print(ConsoleColors.CLEAR);
                    System.out.println("Dealer's turn:");
                    
                    // Dealer
                    int dealerScore = calculateScore(dealerDesk);
                    while (dealerScore < 17) {
                        Card card = mainDesk.getRandomCardFromDesk();
                        dealerDesk.addCard(card);
                        dealerScore = calculateScore(dealerDesk);
                    }
                    
                    System.out.println("Dealer's final cards: (Score: " + dealerScore + ")");
                    Ascii_new.outDesk(dealerDesk.getDesk());
                    System.out.println("\nYour cards: (Score: " + playerScore + ")");
                    Ascii_new.outDesk(playerDesk.getDesk());
                    
                    // Determine winner
                    if (dealerScore > 21) {
                        System.out.println("\nDealer busts! You win!");
                    } else if (dealerScore > playerScore) {
                        System.out.println("\nDealer wins!");
                    } else if (playerScore > dealerScore) {
                        System.out.println("\nYou win!");
                    } else {
                        System.out.println("\nIt's a tie!");
                    }
                    return;
                }
                case "quit" -> {
                    System.out.println("Game over");
                    return;
                }
                default -> System.out.println("Invalid input. Use 'more', 'stand', or 'quit'");
            }
        }
    }
    
    private static int calculateScore(Desk desk) {
        int score = 0;
        int aces = 0;
        
        for (Card c : desk.getDesk()) {
            if (c.number > 10) {
                score += 10;
            } else if (c.number == 1) {
                aces++;
                score += 11;
            } else {
                score += c.number;
            }
        }
        
        // aces can be 1 or 11
        while (score > 21 && aces > 0) {
            score -= 10;
            aces--;
        }
        
        return score;
    }
}