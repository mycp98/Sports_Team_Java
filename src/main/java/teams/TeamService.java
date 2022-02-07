package teams;

import players.Player;

// We want to:
// add a player to the team
// counting empty spaces on the team
// replace manager on the team
public class TeamService {
    public TeamService(){

    }


    //Method: count empty spaces on team
    //return int
    //parameters: Team
    public int countEmptySpacesOnTeam(Team team){
        //counter/temporary variable to store count
        int count = 0;
        //loop through players array and count nulls
        for(Player player : team.getPlayers()){
            //if statement
            //if player is null, add one to count
            //if(player.equals(null)) is ALWAYS going to be false
            if(player == null){
                count++;
            }
        }
        //return count
        return count;
    }
}
