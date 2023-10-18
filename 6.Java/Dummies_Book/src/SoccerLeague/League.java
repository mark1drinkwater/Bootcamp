package SoccerLeague;

import java.util.*;

public class League {
    List<TeamScore> teamPoints = new LinkedList<>();
    List<Match> matches = new ArrayList<>();
    Set<String> setNames = new HashSet<>();

    public void addMatch(Match match) {
        setNames.add(match.team1Name());
        setNames.add(match.team2Name());
        matches.add(match);
    }

    public void addGame(String teamName, int points) {
        for (var team : teamPoints) {
            if (team.getTeamName().equals(teamName)) {
                team.addPoints(points);
                return;
            }
        }
    }

    public void populateTeamNames() {
        for (var team : setNames) {
            var ts = new TeamScore(team);
            teamPoints.add(ts);
        }
    }

    public void calculateWinners() {
        for (var match : matches) {
            if (match.team1Score() > match.team2Score()) {
                addGame(match.team1Name(), 3);
            } else if (match.team1Score() < match.team2Score()) {
                addGame(match.team2Name(), 3);
            } else {
                addGame(match.team1Name(), 1);
                addGame(match.team2Name(), 1);
            }
        }
    }

    @Override
    public String toString() {
        Collections.sort(teamPoints);

        String result = "";
        int i = 1;
        for (var team : teamPoints) {
            result += "%d. %s\n%d\n".formatted(i, team.getTeamName(), team.getPoints());
            i++;
        }

        return result;
    }
}