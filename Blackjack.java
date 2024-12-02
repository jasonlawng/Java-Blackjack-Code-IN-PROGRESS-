import javax.swing.Timer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
	public static void main(String[] args) {

    // timer 
    Timer time;
    Timer timer = new Timer(100, null);

    // create randomizer objects
    Random rand = new Random();

    /* create an arraylist later
    ArrayList<Integer> others = new ArrayList<Integer>();
    */

    // create input - output
    Scanner scan = new Scanner(System.in);

    // logic variables
    int playerCard;
    int playerCard2;
    int playerCard3;
    int computerCard;
    int computerCard2;
    int computerCard3;
    int ties = 0;

    // array to represent card possibilities
         int[] cards = {2, 2, 2, 2,
                        3, 3, 3, 3,
                        4, 4, 4, 4,
                        5, 5, 5, 5,
                        6, 6, 6, 6,
                        7, 7, 7, 7,
                        8, 8, 8, 8, 
                        9, 9, 9, 9, 
                        10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
      
        // random player cards
        int a = rand.nextInt(0, 44);
        int b = rand.nextInt(0, 44);
        int c = rand.nextInt(0, 44);
        playerCard = cards[a];
        playerCard2 = cards[b];
        playerCard3 = cards[c];

        // random computer cards
        int d = rand.nextInt(0, 44);
        int e = rand.nextInt(0, 44);
        int f = rand.nextInt(0, 44);
        computerCard = cards[d];
        computerCard2 = cards[e];
        computerCard3 = cards[f];


        System.out.println("You have a " + playerCard + " and a " + playerCard2 + " (" + (playerCard + playerCard2) + ")");
        System.out.println("Do you wish to hit?");
        System.out.println("[y] [n]");
        String response = scan.nextLine();

        if (response.equals("y")) {
            System.out.println("You now have a " + playerCard + " and a " + playerCard2 + " and a " + cards[c] + " (" + (playerCard + playerCard2 + cards[c]) + ")");

            if ((playerCard + playerCard2 + playerCard3) > (computerCard + computerCard2 + computerCard3)) {

                System.out.println("You won! The dealer had a " + computerCard + computerCard2 + computerCard3 + (computerCard + computerCard2 + computerCard3));

            }

            else if ((playerCard + playerCard2 + playerCard3) > (computerCard + computerCard2 + computerCard3)) {

                System.out.println("You lost. The dealer had a " + computerCard + computerCard2 + computerCard3 + (computerCard + computerCard2 + computerCard3));
            }

            else {

                ties++;
                System.out.println("Play again. You tied.");
            }

        }

        else {
            System.out.println("The dealer had a " + computerCard + " and a " + computerCard2);

            if ((playerCard + playerCard2) > (computerCard + computerCard2)) {

                
                System.out.println("You won!");
            }

            else {

                System.out.println("You lost.");
            }
        }

}

}
