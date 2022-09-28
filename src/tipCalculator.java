import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the total of your bill: ");
        double bill = scan.nextDouble();
        System.out.println("Please enter the tip percentage (without the percentage sign): ");
        double tip = scan.nextInt();
        System.out.println("Please enter the number of people in the party: ");
        int people = scan.nextInt();

        tip /= 100.0;
        double tipPer = (bill * tip)/people;
        double billPer = (bill/people);
        double totalPer = (billPer + tipPer);
        double billTotal = (tipPer * people) + bill;
        double tipTotal = (tipPer * people);

        System.out.println(tip);

        System.out.println("The total tip amount is $" + tipTotal);
        System.out.println("The total bill including tip is $" + billTotal);
        System.out.println("The tip per person is $" + tipPer);
        System.out.println("The total per person is $" + totalPer);






    }
}
