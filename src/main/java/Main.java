import managers.Manager;
import players.Player;
import teams.Team;
import teams.TeamService;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Finn Russell", "Fly Half", 10, 10);
//        Player player2 = new Player("Finn Russell", "Fly Half", 10, 10);

//        System.out.println(player == player2);   //false because they are NOT the same object
//
//        System.out.println(player.hashCode());
//        System.out.println(player2.hashCode());
//
//        System.out.println(player.equals(player2));   //.equals : have they actually got the same stuff in them                                                           (got the same value) ---> true


        Manager manager = new Manager("Gregor Townsend");

        Team scotland = new Team("Scotland", manager);

        Manager manager2 = new Manager("Eddie Jones");

        Team england = new Team("England", manager2);

//        System.out.println(scotland);
//        System.out.println(scotland.toString());
//        System.out.println(england.toString());

        //Make an instance/object for TeamService:
        TeamService teamService = new TeamService();

        int spacesBefore = teamService.countEmptySpacesOnTeam(scotland);   //method requires to pass it a team
        System.out.println(spacesBefore);

        teamService.addPlayerToTeam(scotland, player);

        int spacesAfter = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spacesAfter);
    }
}
