public class TipCalculator {
    private double totalBill;
    private int tipPercent;
    private int numberOfPeople;


    // making the constructor so it's easier to enter in values
    public TipCalculator(double bill, int tip, int people) {
        totalBill = bill;
        tipPercent= tip;
        numberOfPeople= people;
    }


    // initializes the amount of bill + tip
    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
    public double totalTip() {
        double tip = totalBill * (tipPercent / 100.0);
        return roundToTwoDecimals(tip);
    }


// initializes bill including tip
    public double totalMoney() {
        double totalWithTip = totalBill + totalTip();
        return roundToTwoDecimals(totalWithTip);
    }

    // divides tip by number of people
    public double tipPerPerson() {
        double tipPerPerson = totalTip() / numberOfPeople;
        return roundToTwoDecimals(tipPerPerson);
    }

    // divides total bill by the number of people
    public double totalPerPerson() {
        double totalPerPerson = totalMoney() / numberOfPeople;
        return roundToTwoDecimals(totalPerPerson);
    }

    /prints all the calculations out
    public void printReceipt(){
        System.out.println("Your total bill including tip is: $" + totalMoney());
        System.out.println("Your total tip is $" + totalTip());
        System.out.println("------------------------------");
        System.out.println("The total tip per person is: $" + tipPerPerson());
        System.out.println("The total amount per person is: $" + totalPerPerson());
    }


}

