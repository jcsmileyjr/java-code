package chp6;

public class PhoneBill {
    private int id;
    private double cost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {
        this.id = 1;
        this.cost = 100.00;
        this.allottedMinutes = 500;
        this.minutesUsed = 500;
    }

    public PhoneBill(int id) {
        this.id = id;
        this.cost = 100.00;
        this.allottedMinutes = 500;
        this.minutesUsed = 500;
    }

    public PhoneBill(int id, double cost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.cost = cost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverageFee() {
        double overageRate = .25;
        double minutesOver = 0;
        if (this.minutesUsed > this.allottedMinutes) {
            minutesOver = this.minutesUsed - this.allottedMinutes;
        }

        double overageFee = minutesOver * overageRate;
        return overageFee;
    }

    public double calculateTaxes(double overageFee) {
        double taxRate = .15;

        return (this.cost + overageFee) * taxRate;
    }

    public double calculateFinalTotal(double taxes, double overageFee) {
        return this.cost + taxes + overageFee;
    }

    public int getId() {
        return this.id;
    }

    public void itemizeBill() {
        double overages = calculateOverageFee();
        double taxes = calculateTaxes(overages);
        double total = calculateFinalTotal(taxes, overages);
        System.out.println("Bill #" + this.id + " used " + this.minutesUsed + " minutes of " + this.allottedMinutes
                + " minutes resulting in an overage of $" +String.format("%.2f", overages));
        System.out.println("Bill $" + this.id + " had taxes in the amount of $"+ String.format("%.2f", taxes));
        System.out.println("Bill #" + this.id + "  total bill amount is $" + String.format("%.2f", total));
        System.out.println("####################################################");
    }
}


