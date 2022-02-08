import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<T>();
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in the league");
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void printTable() {
        Collections.sort(teams);
        for (Team team : teams) {
            System.out.println(team.getName() + " Ranking: " + team.ranking());
        }
    }
}
