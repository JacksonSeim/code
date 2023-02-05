/** 
* Proj3.java 
* <Jackson Seim / Thursday 4:30pm - 6:20pm>  
* 
*
* <#######> 
*/
import java.util.*;
import java.util.Scanner;
public class Proj3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        final int WIN = 20;
        int dice = -1; int p1Total = 0; int p2Total = 0;
        int p1Turn; int p2Turn;
        char input;
        boolean p1Win = false; boolean p2Win = false;

        //Part 1
        while (p1Total < WIN && p2Total < WIN){
            for (int i = 1; i < 3; i++){

                p1Turn = 0; p2Turn = 0;

                do{
                    if (i == 1){System.out.printf("\nPlayer %d turn total is %d. Enter (r)oll or (s)top: ", i, p1Turn);}
                    else {System.out.printf("\nPlayer %d turn total is %d. Enter (r)oll or (s)top: ", i, p2Turn);}
                    input = scan.nextLine().charAt(0);
                    if (input == 'r' || input == 'R'){
                        System.out.printf("You rolled: %d\n", dice = rand.nextInt(1, 7));
                        if (dice == 1){
                            if(i==1){p1Turn=0;}
                            else{p2Turn=0;}
                            continue;}
                        else{
                            if(i==1){p1Turn+=dice;}
                            else{p2Turn+=dice;}
                        }
                    }
                    else if (input == 's' || input == 'S'){
                        if(i==1){p1Total+=p1Turn;}
                        else{p2Total+=p2Turn;}
                        break;
                    }

                } while (dice != 1);
                System.out.println("Turn over.");
                System.out.printf("Current score: Player 1 has %d, Player 2 has %d\n", p1Total, p2Total);
                if (p1Total >= WIN){p1Win = true;break;}
                else if (p2Total >= WIN){p2Win = true;break;}
            }
        }
        if (p1Win){System.out.println("Player 1 wins");}
        else if (p2Win){System.out.println("Player 2 wins");}

        //Part 2
        System.out.println("\nPress enter to continue to Part 2...:");

    }
}