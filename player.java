

/**
 * Classical: player.java
 *
 * @version   $Id: player.java,v 1.0 11/09/2015 20:46:36 $
 *
 * @author Varun Dhingra
 *
 *Each player will be an instance of this player class.
 */


import java.util.Random;

//THIS IS THE MODEL VIEW

/**
 * Every player is a separate thread, that is instantiated by the Server
 */
public class player extends Thread{
    String player_name;
    int generatedNumber;

    /**
     * Player constructor initialized everytime during Object instantiation
     * @param player_name
     */
    public player(String player_name)
    {
        this.player_name = player_name;
        this.generatedNumber = 0;
    }

    @Override
    public String toString() {
        return "player{" +
                "player_name='" + player_name + '\'' +
                ", generatedNumber=" + generatedNumber +
                '}';
    }

    /**
     * Random numbers are generated here
     */
    public void generateRandom()
    {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNo;

        randomNo = random.nextInt((max - min) + 1) + min;
        this.generatedNumber = randomNo;

    }



    public void run()
    {
        generateRandom();

    }

}
