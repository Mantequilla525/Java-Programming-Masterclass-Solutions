public class Main {

    public static void main(String[] args) {
        League<Team> nfl = new League<>("nfl");

        FootballPlayer burrow = new FootballPlayer("Burrow");
        FootballPlayer stafford = new FootballPlayer("Stafford");

        Team<FootballPlayer> bengals = new Team<FootballPlayer>("Cincinnati Bengals");
        Team<FootballPlayer> rams = new Team<FootballPlayer>("L.A Rams");
        Team<FootballPlayer> packers = new Team<FootballPlayer>("Green Bay Packers");
        Team<FootballPlayer> bears = new Team<FootballPlayer>("Chicago Bears");

        nfl.addTeam(bears);
        nfl.addTeam(bengals);
        nfl.addTeam(packers);
        nfl.addTeam(rams);

        bengals.getResult(rams, 21, 8);
        bengals.getResult(packers, 21, 28);
        bengals.getResult(bears, 35, 8);

        rams.getResult(packers, 21, 28);
        rams.getResult(bears, 41, 3);

        packers.getResult(bears, 91, 21);

        nfl.printTable();
    }
}
