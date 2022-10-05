import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the total of your bill: ");
        double bill = scan.nextDouble();
        System.out.println("Please enter the tip percentage (without the percentage sign): ");
        double tip = scan.nextInt();
        tip /= 100.0;
        System.out.println("Please enter the number of people in the party: ");
        int people = scan.nextInt();

        double tipPer = Math.round(((bill * tip)/people)*100.0)/100.0;
        double billPer = Math.round((bill/people)*100.0)/100.0;
        double totalPer = Math.round((billPer + tipPer)*100.0)/100.0;
        double billTotal = Math.round(((tipPer * people) + bill)*100.0)/100.0;
        double tipTotal = Math.round((tipPer * people)*100.0)/100.0;


        System.out.println("The total tip amount is $" + tipTotal);
        System.out.println("The total bill including tip is $" + billTotal);
        System.out.println("The tip per person is $" + tipPer);
        System.out.println("The total per person is $" + totalPer);
    }
}
