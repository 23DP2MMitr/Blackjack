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
}
