import java.io.*;
import java.util.*;

public class PlayerManager {
    private static final String FILE_NAME = "players.csv";

    public static int registerOrLoadPlayer(String username) {
        Map<String, Integer> players = new HashMap<>();

        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    players.put(parts[0], Integer.parseInt(parts[1]));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!players.containsKey(username)) {
            players.put(username, 10000);
            savePlayers(players);
        }

        return players.get(username);
    }

    public static void updatePlayerChips(String username, int newChipsAmount) {
        Map<String, Integer> players = new HashMap<>();

        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    players.put(parts[0], Integer.parseInt(parts[1]));
                }
            }
            reader.close();

            if (players.containsKey(username)) {
                players.put(username, newChipsAmount);
            }

            savePlayers(players);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void savePlayers(Map<String, Integer> players) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<String, Integer> entry : players.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showLeaderboard() {
        System.out.print(ConsoleColors.CLEAR);
        List<Player> players = new ArrayList<Player>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    Player player = new Player();
                    player.name = parts[0];
                    player.chips = Integer.parseInt(parts[1]);
                    players.add(player);
                }

            }
            reader.close();
            players.sort(Comparator.comparingInt(p -> p.chips));
            
            for (int i = players.size() - 1; i >= 0; i--) {
                Player player = players.get(i);
                System.out.println(player.name + ": " + player.chips);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
