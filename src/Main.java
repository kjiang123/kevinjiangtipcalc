import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       DecimalFormat formatter = new DecimalFormat("#.##");

       // start of calculator and getting info
       System.out.println("Welcome to the tip Calculator!");
       System.out.print("How many people are in your group?: ");
       int people = scan.nextInt();

       // repeats if tip amount is negative, from my partner suggestion
       System.out.print("What's the tip percentage? (0-100): ");
       int tipPercentage = scan.nextInt();
       while (tipPercentage<0){
           System.out.println("The tip cannot be negative");
           System.out.print("What's the tip percentage? (0-100): ");
           tipPercentage = scan.nextInt();
       }

       // initializing some variables
       double totalCost = 0;
       double itemAmount =0;

       // money of each person/item
       while(itemAmount != -1){
           System.out.print("Enter a cost in dollars and cents. Enter -1 to stop: ");
           itemAmount = scan.nextDouble();
           totalCost += itemAmount;
       }
       totalCost ++; // have to add 1 because it subtracts 1 in the while loop

        // printing and math
        System.out.println("----------------------------");
       System.out.println("Total Bill Before Tip: " + formatter.format(totalCost));
       System.out.println("Tip Percentage: " + tipPercentage);
       double tip = (tipPercentage*.01)*totalCost;
       System.out.println("Total Tip: " + formatter.format(tip));
       System.out.println("Total Bill With Tip: " + formatter.format((totalCost+tip)));
       System.out.println("Per Person Cost before tip: " + formatter.format((totalCost/people)));
       System.out.println("Tip per person: " + formatter.format(tip/people));
       System.out.println("Total cost per person: " + formatter.format((totalCost+tip)/people));
    }
}