package PhoneBillCalculator;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        // Example usage of PhoneBill class
        PhoneBill bill1 = new PhoneBill(1232,20,1000,1500);
        System.out.println("Bill ID: " + bill1.getID() +"\n" +
                           "Base Cost: $" + bill1.getBaseCost() + "\n" +
                           "Alloted Minutes: " + bill1.getAllotedMinutes() + "\n" +
                           "Used Minutes: " + bill1.getUsedMinutes() + "\n" +
                           "Overage: $" + bill1.getOverage() + "\n" +
                           "Total Bill: $" + bill1.getTotalBill() + "\n");

        PhoneBill bill2 = new PhoneBill();
        bill2.printBillDetails();
    }

        

}
