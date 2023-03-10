/** 
* Proj3.java 
* <Jackson Seim / Thursday 4:30pm - 6:20pm>  
* 
*
* <Proj3 is a text based java game that runs off of "dice" or a random number generator that generates a number 1-6. Part 1 is a game between 2 players and once they reach 20 the game ends automaticlly. Part 2 is a game between a player and an AI it is the same game and ends when one of the "players" reaches 20.> 
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
        if (p1Win){System.out.println("Player 1 wins\n");}
        else if (p2Win){System.out.println("Player 2 wins\n");}

        System.out.println("Press enter to continue ot Part 2..."); String temp = scan.nextLine();

        //Part 2
        p1Total = 0; p1Win = false; p1Turn = 0; dice = -1;
        int aiTotal = 0; boolean aiWin = false; int aiTurn = 0; boolean aiRoll;

        while (p1Total < WIN && aiTotal < WIN){
            for (int i = 1; i < 3; i++){

                p1Turn = 0; aiTurn = 0;

                do{
                    if (i == 1){
                        System.out.printf("\nPlayer %d turn total is %d. Enter (r)oll or (s)top: ", i, p1Turn);
                        input = scan.nextLine().charAt(0);
                        if (input == 'r' || input == 'R'){
                            System.out.printf("You rolled: %d\n", dice = rand.nextInt(1, 7));
                            if (dice == 1){p1Turn = 0; continue;}
                            else{p1Turn+=dice;}
                        }
                        else if (input == 's' || input == 'S'){p1Total+=p1Turn;break;}
                    }
                    else {
                        //"algorithm" 
                        aiRoll = true; aiTurn = 0;
                        for (int j = 0; j < 2; j++){
                            if (aiTurn < WIN){
                                System.out.printf("\nComputer turn total is %d. Computer rolls.\n",aiTurn);
                                System.out.printf("Computer rolled: %d\n", dice = rand.nextInt(1, 7));
                                if (dice == 1){aiTurn = 0; aiRoll = false; break;}
                                else{aiTurn+=dice;}
                            }
                            else{System.out.printf("\nComputer turn total is %d. Computer stops.\n",aiTurn); aiRoll = false; dice = 1;}
                        }
                        if ((aiTurn<10) && p1Total >= 13 && aiTotal < 10 && aiRoll){
                            while (aiTurn < 10) {
                                System.out.printf("\nComputer turn total is %d. Computer rolls 2.\n",aiTurn);
                                System.out.printf("Computer rolled: %d\n", dice = rand.nextInt(1, 7));
                                if (dice == 1){aiRoll = false; break;}
                                else{aiTurn+=dice;}
                            }
                            System.out.println(dice);
                            if (dice == 1){aiTurn = 0;}
                        }
                        else {System.out.printf("\nComputer turn total is %d. Computer stops\n", aiTurn);}
                        dice = 1;
                        aiTotal+=aiTurn;
                    }   


                } while (dice != 1);
                System.out.println("Turn over.");
                System.out.printf("Current score: You have %d, Computer has %d\n", p1Total, aiTotal);
                if (p1Total >= WIN){p1Win = true;break;}
                else if (aiTotal >= WIN){aiWin = true;break;}
            }
        }
        if (p1Win){System.out.println("\nYou win!\n");}
        else if (aiWin){System.out.println("\nComputer wins!\n");}
        
    
    
    
    
    }
}