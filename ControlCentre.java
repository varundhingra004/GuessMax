
/**
 * Classical: ControlCentre.java
 *
 * @version   $Id: player.java,v 1.0 11/09/2015 20:46:36 $
 *
 * @author Varun Dhingra
 */

//THIS IS THE CONTROLLER

/**
 * This class will act as the server and will thus generate multiple players as separate threads.
 */
public class ControlCentre {

    static UserInterface ui = new UserInterface();
    static player[] playercollection;

    public static void main(String args[])
    {
        while(true) {
            int display_flag_status = display();
            if (display_flag_status == 0) {
                ui.ExitPrint();
                System.exit(0);
            } else if (display_flag_status == 1)
                startGame();


            ui.DisplayPlayerInfo(playercollection);
            ui.DisplayWinner(getWinnerFromModel());
        }




    }

    /**
     * display method will call the method of the view layer
     * @return
     */
    public static int display(){
            return ui.gameplay();

    }

    public static void startGame(){

        //System.out.println("Game has started");
        final int no_of_players = 2;

        //Call game play() and do condtitonal based on value returnned

        playercollection = new player[no_of_players];
        for(int i = 0;i<no_of_players;i++)//INITIALIZE ALL THE PLAYERS
        {
            playercollection[i] = new player("Player "+(i+1));
        }

        for(int i = 0;i<no_of_players;i++){
            playercollection[i].start();
        }
/**
 * Wait for all the players to complete execution only then exit
 */
        for(int i = 0;i<no_of_players;i++) {


            try {
                playercollection[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
		

    }

    public static player[] GetPlayerScores()
    {
        return playercollection;
    }

    public static String getWinnerFromModel()
    {
        GetWinner gw_obj = new GetWinner();
        String victoryString = gw_obj.returnWinner(playercollection);
        return victoryString;
    }






}