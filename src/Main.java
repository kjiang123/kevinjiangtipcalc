import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("How many people are in your group?: ");
       int people = scan.nextInt();
       System.out.print("What's the tip percentage? (0-100): ");
       int tipPercentage = scan.nextInt();

       double totalCost = 0;
       double itemAmount = 0;
       while(itemAmount != -1){
           System.out.print("Enter a cost in dollars and cents. Enter -1 to stop: ");
           itemAmount = scan.nextDouble();
           totalCost += itemAmount;
       }
       totalCost ++; // have to add 1 because it subtracts 1 in the while loop
       System.out.println("----------------------------");
       System.out.println("Total Bill Before Tip: " + totalCost);
       System.out.println("Tip Percentage: " + tipPercentage);
       double tip = (tipPercentage*.01)*totalCost;
       System.out.println("Total Tip: " + tip);
       System.out.println("Total Bill With Tip: " + (totalCost+tip));
       System.out.println("Per Person Cost before tip: " + (totalCost/people));





    }
}