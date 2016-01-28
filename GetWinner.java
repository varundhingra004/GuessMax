/**
 * Classical: GetWinner.java
 *
 * @version   $Id: player.java,v 1.0 11/09/2015 20:46:36 $
 *
 * @author Varun Dhingra
 */

//THIS IS IN MODEL LAYER

/**
 * GetWinner class will generate who the winner is
 */
public class GetWinner {

    //RETURN THE SCORE ATTRIBUTE

    public String returnWinner(player[] playercollection){

        int Max = 0;
        String winner = "";
        for (int i = 0;i<playercollection.length;i++)
        {
            if(playercollection[i].generatedNumber > Max){
                Max = playercollection[i].generatedNumber;
                winner = playercollection[i].player_name;
            }

        }
        return (winner +"\t"+Max);
    }

}
