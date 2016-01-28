/**
 * Classical: UserInterface.java
 *
 * @version   $Id: player.java,v 1.0 11/09/2015 20:46:36 $
 *
 * @author Varun Dhingra
 */


import java.util.Scanner;


//THIS IS THE VIEW LAYER

public class UserInterface {


    public int gameplay() {
        while (true) {
            System.out.println("Press 1 to start playing");
            System.out.println("Press 2 to Stop playing");
            System.out.println("\n");
            int choice;
            int flag = 0;
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
			/**
			 *When the user inputs his/her choice, the corresponding
			 *cases are executed and flag variables are set accordingly.
			 *flag variable ensures the continuity of the program and 
			 *also ensures that program exits when the user inputs an incorrect
			 *choice. 
			 */

            switch (choice) {
                case 1:
                    flag = 1;
                    break;
                case 2:
                    flag = 0;
                    break;
                default:
                    flag = 3;
            }

            if (flag == 0) {
                return 0;
            }
            else if (flag == 3)
                System.out.println("WRONG CHOICE !!!\n");
            else {
                return 1;
            }

        }
    }
	/**
	 *The following functions are used to display the output to the
	 *user. Hence this is a part of the view layer.	
	 */
    public void DisplayPlayerInfo(Object[] obj)
    {
        for(int i = 0;i<obj.length;i++)
        {
            System.out.println(obj[i].toString());
            System.out.println("\n");
        }
    }


    public static void DisplayWinner(String victoryString)
    {
        System.out.println(victoryString);
    }

    public void ExitPrint()
    {
        System.out.println("Thanks for playing");
    }
}
