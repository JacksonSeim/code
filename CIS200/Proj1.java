/** 
* Proj1.java 
* <Jackson Seim / Thursday 4:30pm - 6:20pm>  
* 
*EXTRA CREDIT INCLUDED
*
* <Proj1.java asks the user questions about purchased items then asks for input about those items. For Part 1, it takes those inputs and puts them into an equation that calculates a finance rate. Then discloses the information about the monthly payments and finance rate. Part 2 asks questions about a computer that is being purchased and asks the user for input about that it then calculates the tax and the price of it after tax.> 
*/ 
import java.util.Scanner;
public class Proj1 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the item to be purchase: ");
        String purItem = scan.nextLine();

        System.out.print("Enter the amount of the purchase: ");
        double purAmo = scan.nextDouble();

        System.out.print("Enter the finance rate (Ex. 0.035): ");
        double rate = scan.nextDouble();

        double monPay = ((purAmo * rate) + purAmo)/12;

        System.out.printf("\nYour monthly payment is $%.2f\n", monPay);
        System.out.printf("Your total payment is $%.2f\n", monPay*12);
        System.out.printf("Amount paid in financing is $%.2f\n", (monPay*12 - purAmo));



        System.out.print("\nWhat brand of computer do you wish to purchase? ");
        String brandtemp = scan.nextLine();
        String brand = scan.nextLine();
        
        System.out.print("Which model? ");
        String model = scan.nextLine();
        
        System.out.print("Enter the cost of the computer: ");
        double compCost = scan.nextDouble();

        System.out.print("Enter the tax rate (Ex. 0.0698): ");
        double tax = scan.nextDouble();

        System.out.println("\nBrand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Sales tax: $%.2f\n", compCost*tax);
        System.out.printf("Total Cost: $%,.2f", compCost*(1+tax));


    
    }
}