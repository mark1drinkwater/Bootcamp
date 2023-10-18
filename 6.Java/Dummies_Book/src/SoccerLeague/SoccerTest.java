package SoccerLeague;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SoccerTest {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Mark\\Documents\\Bootcamp\\6.Java\\Dummies_Book\\src\\soccer.txt");
        League theLeague = new League();

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                Match match = extractMatch(line);
                theLeague.addMatch(match);
            }
        } catch (IOException e) {
            System.out.println("An IOException has occurred: " + e);
        }

        theLeague.populateTeamNames();
        theLeague.calculateWinners();
        System.out.println(theLeague);
    }

    private static Match extractMatch(String input) {
        String[] outcomes;
        outcomes = input.split(",");

        String team1Name = outcomes[0].substring(0, outcomes[0].length()-2).trim();
        String team2Name = outcomes[1].substring(0, outcomes[1].length()-2).trim();

        int team1Score = Integer.parseInt(outcomes[0].substring(outcomes[0].length()-1));
        int team2Score = Integer.parseInt(outcomes[1].substring(outcomes[1].length()-1));

        return new Match(team1Name, team1Score, team2Name, team2Score);
    }
}