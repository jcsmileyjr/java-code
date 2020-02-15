package chp6;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill firstBill = new PhoneBill();
        firstBill.itemizeBill();

        PhoneBill secondBill = new PhoneBill(2);
        secondBill.itemizeBill();

        PhoneBill thirdBill = new PhoneBill(3, 200,500,1000);
        thirdBill.itemizeBill();
/*
        double overages =firstBill.calculateOverageFee();
        double taxes = firstBill.calculateTaxes(overages);
        double total = firstBill.calculateFinalTotal(taxes, overages);
        System.out.println("First bill amount is $" + String.format("%.2f", total));
*
* */

    }
}
