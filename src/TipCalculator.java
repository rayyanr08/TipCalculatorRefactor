public class TipCalculator {
    private double totalBill;
    private int tipPercent;
    private int numberOfPeople;

    public TipCalculator(double bill, int tip, int people) {
        totalBill = bill;
        tipPercent= tip;
        numberOfPeople= people;
    }


    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
    public double totalTip() {
        double tip = totalBill * (tipPercent / 100.0);
        return roundToTwoDecimals(tip);
    }



    public double totalMoney() {
        double totalWithTip = totalBill + totalTip();
        return roundToTwoDecimals(totalWithTip);
    }

    public double tipPerPerson() {
        double tipPerPerson = totalTip() / numberOfPeople;
        return roundToTwoDecimals(tipPerPerson);
    }

    public double totalPerPerson() {
        double totalPerPerson = totalMoney() / numberOfPeople;
        return roundToTwoDecimals(totalPerPerson);
    }

    public void printReceipt(){
        System.out.println("Your total bill including tip is: $" + totalMoney());
        System.out.println("Your total tip is $" + totalTip());
        System.out.println("------------------------------");
        System.out.println("The total tip per person is: $" + tipPerPerson());
        System.out.println("The total amount per person is: $" + totalPerPerson());
    }


}

