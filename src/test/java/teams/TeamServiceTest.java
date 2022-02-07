package teams;

import managers.Manager;
import org.junit.jupiter.api.Test;
import players.Player;

import static org.assertj.core.api.Assertions.assertThat;


public class TeamServiceTest {
    @Test
    public void canCountEmptySpacesOnTeamWhenEmpty(){
        //Given
        Manager manager = new Manager("test manager");  //need to create the manager object before passing it onto the team
        Team team = new Team("team1", manager);
        TeamService underTest = new TeamService();
        //When
        int actual = underTest.countEmptySpacesOnTeam(team);
        //Then
        int expected = 15;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canCountEmptySpacesOnTeamWithOnePlayer(){
        //Given
        Manager manager = new Manager("test manager");
        Team team = new Team("Test RFC", manager);
        Player player = new Player("test player", "winger", 11, 2);
        TeamService underTest = new TeamService();

        team.getPlayers()[0] = player;

//        try {
//            underTest.addPlayerToTeam(team, player);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //When
        int actual = underTest.countEmptySpacesOnTeam(team);

        //Then
        int expected =14;
        assertThat(actual).isEqualTo(expected);

    }
}
