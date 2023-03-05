/** 
* Proj5.java 
* Jackson Seim/Thursday 4:30 - 6:20  
* 
* This program asks the user for the name of a .txt file. It then checks to make sure the file exists then reads the first line from the file with the size of the ASCII art in the file. It takes the row and column amounts then makes a local 2D array to store the art in. Then it looks at the last row and column, parity bits, to then determine if there are any errors in the file and where. If there is more than 1 column error or 1 row error then it will not process the image but if there is only one of each or none then it asks the user for characters to use instead of 1 or 0 and then prints out the art. Then asks the user if they want to process another file and the process repeats.
*/ 







import java.io.*;   import java.util.Scanner;
import java.util.stream.Collectors;

//when there is no errors it returns -1 on flower.txt

public class Proj5 {
    public static void main (String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        char lmoa = 'y';

        while(lmoa == 'y' || lmoa == 'Y'){

            System.out.print("Enter name of input file: "); String inputFile = scan.nextLine();
            File file = new File(inputFile);
            while (!file.exists()){
                System.out.print("Invalid filename. Please re-enter: "); inputFile = scan.nextLine();
                file = new File(inputFile);
            }

            //get size of picture
            Scanner inFile = new Scanner (new File(inputFile));
            String size = inFile.nextLine();
            int fileRows = Integer.parseInt(size.substring(0, (size.indexOf("x"))));
            int fileCol = Integer.parseInt(size.substring(size.indexOf("x") + 1));
            String l = inFile.nextLine();
            
            //put picture from file into local array
            int[][] arrFile = new int[fileRows][fileCol];
            String temp;
            for (int rows = 0; rows < fileRows; rows++){
                temp = inFile.nextLine();
                for (int col = 0; col < fileCol; col++){
                    arrFile[rows][col] = Integer.parseInt(temp.substring(col, col+1));
                }
            }
            
            //check for errors in the rows
            int parity;
            int rowErrorCount = 0; int[] rowError = new int[arrFile.length]; 
            for (int rows = 0; rows < arrFile.length-1; rows++){
                parity = 0;
                for (int col = 0; col < arrFile[rows].length-1; col++){
                    parity+=arrFile[rows][col];
                }

                if (!((parity%2 == 0 && arrFile[rows][arrFile[rows].length-1] == 0) || (parity%2 == 1 && arrFile[rows][arrFile[rows].length-1] == 1))){
                    rowErrorCount++;
                    rowError[rows] = 1;
                    System.out.println("Off at ROW " + rows);
                }
                else{rowError[rows] = 0;}
                
            }

            //check for error in columns
            parity = 0;
            int colErrorCount = 0; int[] colError = new int[arrFile[0].length];
            for (int col = 0; col < arrFile[0].length-1;/*amount of columns no parity bits*/ col++){
                parity = 0;
                for (int rows = 0; rows < arrFile.length-1;/*amount of rows no parity bits*/ rows++){
                    
                    parity+=arrFile[rows][col];
                }

                if (!((parity%2 == 0 && arrFile[arrFile.length-1][col] == 0) || (parity%2 == 1 && arrFile[arrFile.length-1][col] == 1))){
                    colErrorCount++;
                    colError[col] = 1;
                    System.out.println("Off at COL " + col);
                }
                else{colError[col] = 0;}
            }

            //check for multiple errors
            if (rowErrorCount > 1 || colErrorCount > 1){System.out.println("Multiple errors were detected. Image may be damaged");}
            else if (rowErrorCount == 0 && colErrorCount == 0){
                System.out.println("No errors in transmission were detected.");

                //asking for characters and printing
                System.out.print("\nWhat character would you like to use for white? "); char white/*1*/ = (scan.nextLine()).charAt(0);
                System.out.print("What character would you like to use for black?"); char black/*0*/ = (scan.nextLine()).charAt(0);
                System.out.print("\n\n");

                for (int rows = 0; rows < arrFile.length-1; rows++){
                    for (int col = 0; col < arrFile[rows].length-1; col++){ 
                        if (arrFile[rows][col] == 0){System.out.print(black);}
                        else if (arrFile[rows][col] == 1){System.out.print(white);}
                    }
                    System.out.println();
                }
            }
            else{
                //look at where error is, in rowError and colError then change it
                int x = -1; int y = -1;
                for (int i = 0; i < rowError.length; i++){
                    if (rowError[i] == 1){y = i;}
                }
                for (int i = 0; i < colError.length; i++){
                    if (colError[i] == 1){x = i;}
                }
                if (arrFile[y][x] == 0){arrFile[y][x] = 1;}
                else if (arrFile[y][x] == 1){arrFile[y][x] = 0;}
                System.out.printf("Position (%d, %d) was modified...correcting\n", y/*row*/, x/*column*/);

                //asking for characters and printing
                System.out.print("\nWhat character would you like to use for white? "); char white/*1*/ = (scan.nextLine()).charAt(0);
                System.out.print("What character would you like to use for black?"); char black/*0*/ = (scan.nextLine()).charAt(0);
                System.out.print("\n\n");

                for (int rows = 0; rows < arrFile.length-1; rows++){
                    for (int col = 0; col < arrFile[rows].length-1; col++){ 
                        if (arrFile[rows][col] == 0){System.out.print(black);}
                        else if (arrFile[rows][col] == 1){System.out.print(white);}
                    }
                    System.out.println();
                }
            }

        
            System.out.print("Process another file? (Yes/No): "); lmoa = (scan.nextLine()).charAt(0);
        }
    }
}