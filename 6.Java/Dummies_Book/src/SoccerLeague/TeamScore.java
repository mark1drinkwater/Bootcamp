package SoccerLeague;

public class TeamScore implements Comparable<TeamScore> {
    private final String teamName;

    @Override
    public String toString() {
        return "TeamScore{" +
                "teamName='" + teamName + '\'' +
                ", points=" + points +
                '}';
    }

    private Integer points;

    public String getTeamName() {
        return teamName;
    }

    public int getPoints() {
        return points;
    }

    public TeamScore(String teamName) {
        this.teamName = teamName;
        this.points = 0;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public int compareTo(TeamScore ts) {
        int result = ts.getPoints() - points;

        if (result != 0) return result;

        return this.getTeamName().compareTo(ts.getTeamName());
    }
}