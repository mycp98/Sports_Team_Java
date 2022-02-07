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
        //loop through players array and count nulls   METHOD1
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
//          METHOD2 ---also works to count no.spaces
//        Player[] playersOnTheTeam = team.getPlayers();

//        for(int i=0; i<playersOnTheTeam.length; i++){
//            if(playersOnTheTeam[i] == null){
//                count++;
//            }
//        }
//        return count;
    }

    //Method: add player to the team
    //don't need to return anything ---> use void
    public void addPlayerToTeam(Team team, Player player) throws Exception {
        //Check if there's an empty space
        int spaces = countEmptySpacesOnTeam(team);
        //if there is an empty space, add the player
        if (spaces>0){
            //get players array from team
            Player[] players = team.getPlayers();

            //add player to first available empty space
            //loop through players array
            for(int i = 0; i<players.length; i++){
                //if we find an empty space, add the player to it then break
                if(players[i] == null){
                    players[i] = player;
                    break;
                }
            }


        }
        else{
            throw new Exception();
        }
    }




}
