import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("\033[0;1m" + "Tip Calculator:");
        System.out.println();
        System.out.println();

        Scanner money = new Scanner(System.in);
        System.out.println("Please enter the bill: ");
        String billAmount = money.nextLine();
        double realBillAmount= Double.parseDouble(billAmount);

        Scanner scannerTax = new Scanner(System.in);
        System.out.println("Please enter the tip percentage: ");
        String tipPercentage = scannerTax.nextLine();
        int realTipPercentage = Integer.parseInt(tipPercentage);

        // Initializing number of people
        Scanner scannerPpl = new Scanner(System.in);
        System.out.println("Please enter the number of people: ");
        String numOfPeople = scannerPpl.nextLine();
        int realNumOfPeople = Integer.parseInt(numOfPeople);
        System.out.println();


        TipCalculator party = new TipCalculator(realBillAmount,realTipPercentage, realNumOfPeople);
        party.printReceipt();

    }
}

