import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalc {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);
        double totalCost =0;
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group? ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.println("What's the tip percentage? (0 - 100): ");
        int tip = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double cost = scan.nextDouble();
        int amount = 1;

        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            totalCost += cost;
            cost = scan.nextDouble();
        }

        String totalTip = formatter.format(((tip * 0.01) * totalCost));
        double tipBill = totalTip + totalCost;
        double personCost = totalCost / people;
        double personTip = totalTip / people;
        double personTotal = tipBill / people;
        System.out.println("-----------------------------");
        System.out.println("Total Bill Before Tip: " + totalCost);
        System.out.println("Tip Percentage: " + tip);
        System.out.println("Total Tip: " + totalTip);
        System.out.println("Total Bill With Tip: " + tipBill);
        System.out.println("Per Person Cost Before Tip: " + personCost);
        System.out.println("Tip Per Person: " + personTip);
        System.out.println("Total Cost Per Person: " + personTotal);

    }


}


