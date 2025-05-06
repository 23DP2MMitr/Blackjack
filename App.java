import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        int chips = PlayerManager.registerOrLoadPlayer(username);
        System.out.println("Welcome, " + username + "! You have " + chips + " chips.");

        

        while (true) {
            System.out.println("Enter your bet (you have " + chips + " chips):");
            int bet = scanner.nextInt();
            scanner.nextLine(); 

            if (bet <= 0 || bet > chips) {
                System.out.println("Invalid bet.");
                continue;
            }

            Desk mainDesk = new Desk();
            mainDesk.initalizeDeck();
            Desk playerDesk = new Desk();
            Desk dealerDesk = new Desk();

            for (int i = 0; i < 2; i++) {
                playerDesk.addCard(mainDesk.getRandomCardFromDesk());
                dealerDesk.addCard(mainDesk.getRandomCardFromDesk());
            }

            boolean roundOver = false;

            while (!roundOver) {
                System.out.print(ConsoleColors.CLEAR);
                System.out.println("Dealer's cards: (Score: " + calculateScore(dealerDesk) + ")");
                Ascii_new.outDesk(dealerDesk.getDesk());

                System.out.println("\nYour cards: (Score: " + calculateScore(playerDesk) + ")");
                Ascii_new.outDesk(playerDesk.getDesk());

                System.out.println("\nCommands: 'more' - get another card, 'stand' - end your turn, 'quit' - end game");
                String request = scanner.nextLine();

                switch (request) {
                    case "more" -> {
                        playerDesk.addCard(mainDesk.getRandomCardFromDesk());
                        int playerScore = calculateScore(playerDesk);

                        if (playerScore > 21) {
                            System.out.print(ConsoleColors.CLEAR);
                            System.out.println("Dealer's cards: (Score: " + calculateScore(dealerDesk) + ")");
                            Ascii_new.outDesk(dealerDesk.getDesk());

                            System.out.println("\nYour cards: (Score: " + playerScore + ")");
                            Ascii_new.outDesk(playerDesk.getDesk());

                            System.out.println("\nYou bust! Dealer wins.");
                            chips -= bet;
                            roundOver = true;
                        } else if (playerScore == 21) {
                            System.out.print(ConsoleColors.CLEAR);
                            System.out.println("Dealer's cards: (Score: " + calculateScore(dealerDesk) + ")");
                            Ascii_new.outDesk(dealerDesk.getDesk());

                            System.out.println("\nYour cards: (Score: " + playerScore + ")");
                            Ascii_new.outDesk(playerDesk.getDesk());

                            System.out.println("\nBlackjack! You win!");
                            chips += bet;
                            roundOver = true;
                        }
                    }

                    case "stand" -> {
                        int playerScore = calculateScore(playerDesk);
                        System.out.print(ConsoleColors.CLEAR);
                        System.out.println("Dealer's turn:");

                        int dealerScore = calculateScore(dealerDesk);
                        while (dealerScore < 17) {
                            dealerDesk.addCard(mainDesk.getRandomCardFromDesk());
                            dealerScore = calculateScore(dealerDesk);
                        }

                        System.out.println("Dealer's final cards: (Score: " + dealerScore + ")");
                        Ascii_new.outDesk(dealerDesk.getDesk());

                        System.out.println("\nYour cards: (Score: " + playerScore + ")");
                        Ascii_new.outDesk(playerDesk.getDesk());

                        if (dealerScore > 21) {
                            System.out.println("\nDealer busts! You win!");
                            chips += bet;
                        } else if (dealerScore > playerScore) {
                            System.out.println("\nDealer wins!");
                            chips -= bet;
                        } else if (playerScore > dealerScore) {
                            System.out.println("\nYou win!");
                            chips += bet;
                        } else {
                            System.out.println("\nIt's a tie!");
                        }

                        roundOver = true;
                    }

                    case "quit" -> {
                        System.out.println("Game over");
                        chips -= bet;
                        PlayerManager.updatePlayerChips(username, chips);
                        scanner.close();
                        return;
                    }

                    default -> System.out.println("Invalid input. Use 'more', 'stand', or 'quit'");
                }
            }

            PlayerManager.updatePlayerChips(username, chips);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("no")) {
                System.out.println("Thank you for playing!");
                break;
            }
        }

        PlayerManager.updatePlayerChips(username, chips);
        scanner.close();
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

        while (score > 21 && aces > 0) {
            score -= 10;
            aces--;
        }

        return score;
    }
}