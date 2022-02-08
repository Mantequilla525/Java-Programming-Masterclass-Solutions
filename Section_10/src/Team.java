import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team> {
    private String name;
    private ArrayList<T> players;
    private int wins = 0;
    private int ties = 0;
    private int losses = 0;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getPlayers() {
        return players;
    }

    public void addWin() {
        wins++;
    }

    public void addTie() {
        ties++;
    }

    public void addLoss() {
        losses++;
    }

    public void getResult(Team<T> opponent,
                     int myScore,
                     int theirScore) {
        String message;

        if (opponent == null) {
            System.out.println("Invalid opponent");
            return;
        }

        if (myScore > theirScore) {
            this.addWin();
            opponent.addLoss();
            message = " beat ";
        } else if (myScore == theirScore) {
            this.addTie();
            opponent.addTie();
            message = " tied with ";
        } else {
            this.addLoss();
            opponent.addWin();
            message = " lost to ";
        }
    }

    public int ranking() {
        return (wins * 2) + ties;
    }

    @Override
    public int compareTo(Team o) {
        if (this.ranking() > o.ranking()) {
            return -1;
        } else if (this.ranking() == o.ranking()) {
            return 0;
        } else {
            return 1;
        }
    }
}
