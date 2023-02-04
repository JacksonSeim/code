/** 
* Proj2.java 
* <Jackson Seim / Thursday 4:30pm - 6:20pm>  
* 
*
* <Proj2.java generates 5 random cards and there suits using rand.nextInt(). Then it checks to see if there are any pairs in those five cards. After that it looks for the highest card in the bunch. It does this 5 times in a for loop.> 
*/ 
import java.util.*; 
public class Proj2 {
    public static void main(String[] args) {

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {

            int card1, card2, card3, card4, card5, cardSuit1, cardSuit2, cardSuit3, cardSuit4, cardSuit5;

            card1 = rand.nextInt(2, 15);
            card2 = rand.nextInt(2, 15);
            card3 = rand.nextInt(2, 15);
            card4 = rand.nextInt(2, 15);
            card5 = rand.nextInt(2, 15);

            cardSuit1 = rand.nextInt(4);
            cardSuit2 = rand.nextInt(4);
            cardSuit3 = rand.nextInt(4);
            cardSuit4 = rand.nextInt(4);
            cardSuit5 = rand.nextInt(4);

            System.out.println("Your hand is: ");
            
            if (card1 >= 2 && card1 <= 10) {System.out.print("\t" + card1 + " of ");}
            else {switch (card1){
                    case 11: System.out.print("\tJack of "); break;
                    case 12: System.out.print("\tQueen of "); break;
                    case 13: System.out.print("\tKing of "); break;
                    case 14: System.out.print("\tAce of "); break;}
                }
            switch (cardSuit1) {
                case 0: System.out.println("Spades"); break;
                case 1: System.out.println("Clubs"); break;
                case 2: System.out.println("Hearts"); break;
                case 3: System.out.println("Diamonds"); break;
                default: System.out.println("ERROR"); break;
            }

            if (card2 >= 2 && card2 <= 10) {System.out.print("\t" + card2 + " of ");}
            else {switch (card2){
                    case 11: System.out.print("\tJack of "); break;
                    case 12: System.out.print("\tQueen of "); break;
                    case 13: System.out.print("\tKing of "); break;
                    case 14: System.out.print("\tAce of "); break;}
                }
            switch (cardSuit2) {
                case 0: System.out.println("Spades"); break;
                case 1: System.out.println("Clubs"); break;
                case 2: System.out.println("Hearts"); break;
                case 3: System.out.println("Diamonds"); break;
                default: System.out.println("ERROR"); break;
            }

            if (card3 >= 2 && card3 <= 10) {System.out.print("\t" + card3 + " of ");}
            else {switch (card3){
                    case 11: System.out.print("\tJack of "); break;
                    case 12: System.out.print("\tQueen of "); break;
                    case 13: System.out.print("\tKing of "); break;
                    case 14: System.out.print("\tAce of "); break;}
                }
            switch (cardSuit3) {
                case 0: System.out.println("Spades"); break;
                case 1: System.out.println("Clubs"); break;
                case 2: System.out.println("Hearts"); break;
                case 3: System.out.println("Diamonds"); break;
                default: System.out.println("ERROR"); break;
            }

            if (card4 >= 2 && card4 <= 10) {System.out.print("\t" + card4 + " of ");}
            else {switch (card4){
                    case 11: System.out.print("\tJack of "); break;
                    case 12: System.out.print("\tQueen of "); break;
                    case 13: System.out.print("\tKing of "); break;
                    case 14: System.out.print("\tAce of "); break;}
                }
            switch (cardSuit4) {
                case 0: System.out.println("Spades"); break;
                case 1: System.out.println("Clubs"); break;
                case 2: System.out.println("Hearts"); break;
                case 3: System.out.println("Diamonds"); break;
                default: System.out.println("ERROR"); break;
            }

            if (card5 >= 2 && card5 <= 10) {System.out.print("\t" + card5 + " of ");}
            else {switch (card5){
                    case 11: System.out.print("\tJack of "); break;
                    case 12: System.out.print("\tQueen of "); break;
                    case 13: System.out.print("\tKing of "); break;
                    case 14: System.out.print("\tAce of "); break;}
                }
            switch (cardSuit5) {
                case 0: System.out.println("Spades"); break;
                case 1: System.out.println("Clubs"); break;
                case 2: System.out.println("Hearts"); break;
                case 3: System.out.println("Diamonds"); break;
                default: System.out.println("ERROR"); break;
            }

            //make it say jack, queen, etc.
            if (card1 == card2) {System.out.print("\nYou have a pair of ");
                switch (card1) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card1 + "s"); break;}}
            else if (card1 == card3) {System.out.print("\nYou have a pair of ");
                switch (card1) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card1 + "s"); break;}}
            else if (card1 == card4) {System.out.print("\nYou have a pair of ");
                switch (card1) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card1 + "s"); break;}}
            else if (card1 == card5) {System.out.print("\nYou have a pair of ");
                switch (card1) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card1 + "s"); break;}}
            else if (card2 == card3) {System.out.print("\nYou have a pair of ");
                switch (card2) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card2 + "s"); break;}}
            else if (card2 == card4) {System.out.print("\nYou have a pair of ");
                switch (card2) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card2 + "s"); break;}}
            else if (card2 == card5) {System.out.print("\nYou have a pair of ");
                switch (card2) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card2 + "s"); break;}}
            else if (card3 == card4) {System.out.print("\nYou have a pair of ");
                switch (card3) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card3 + "s"); break;}}
            else if (card3 == card5) {System.out.print("\nYou have a pair of ");
                switch (card3) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card3 + "s"); break;}}
            else if (card4 == card5) {System.out.print("\nYou have a pair of ");
                switch (card4) {
                    case 14: System.out.println("Aces"); break;
                    case 11: System.out.println("Jacks"); break;
                    case 12: System.out.println("Queens"); break;
                    case 13: System.out.println("Kings"); break;
                    default: System.out.println(card4 + "s"); break;}}
            else {System.out.println("\nYou have no pairs");}


            if (card1 >= card2 && card1 >= card3 && card1 >= card4 && card1 >= card5) {System.out.print("\nYour highest card is a(n) ");
                switch (card1) {
                    case 14: System.out.println("Ace"); break;
                    case 11: System.out.println("Jack"); break;
                    case 12: System.out.println("Queen"); break;
                    case 13: System.out.println("King"); break;
                    default: System.out.println(card1); break;}}
            else if (card2 >= card3 && card2 >= card4 && card2 >= card5) {System.out.print("\nYour highest card is a(n) ");
                switch (card2) {
                    case 14: System.out.println("Ace"); break;
                    case 11: System.out.println("Jack"); break;
                    case 12: System.out.println("Queen"); break;
                    case 13: System.out.println("King"); break;
                    default: System.out.println(card2); break;}}
            else if (card3 >= card4 && card3 >= card5) {System.out.print("\nYour highest card is a(n) ");
                switch (card3) {
                    case 14: System.out.println("Ace"); break;
                    case 11: System.out.println("Jack"); break;
                    case 12: System.out.println("Queen"); break;
                    case 13: System.out.println("King"); break;
                    default: System.out.println(card3); break;}}
            else if (card4 >= card5) {System.out.print("\nYour highest card is a(n) ");
                switch (card4) {
                    case 14: System.out.println("Ace"); break;
                    case 11: System.out.println("Jack"); break;
                    case 12: System.out.println("Queen"); break;
                    case 13: System.out.println("King"); break;
                    default: System.out.println(card4); break;}}
            else {System.out.print("\nYour highest card is a(n) ");
                switch (card5) {
                    case 14: System.out.println("Ace"); break;
                    case 11: System.out.println("Jack"); break;
                    case 12: System.out.println("Queen"); break;
                    case 13: System.out.println("King"); break;
                    default: System.out.println(card5); break;}}
            System.out.println();
            
        }

    }
}