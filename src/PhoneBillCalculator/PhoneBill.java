package PhoneBillCalculator;

public class PhoneBill {
    //declare variables
    private int iD;
    private double baseCost;
    private int allotedMinutes;
    private int usedMinutes;
    private double overage;
    private double totalBill;
    //declare constants
    private static final double taxRate = 18.0 / 100.0;
    private static final double overageRate = 0.25;
    private static final double defaultBaseCost = 10.0;
    
    //declare constructor
    public PhoneBill() {
        this.iD = 1000 + (int)(Math.random() * ((5000 - 1000) + 1)); 
        this.baseCost = defaultBaseCost;
        this.allotedMinutes = 0;
        this.usedMinutes = 0;
        this.overage = 0.0;
        this.totalBill = calculateTotalBill();
    }

    public PhoneBill(int iD) {
        this.iD = iD;
        this.baseCost = defaultBaseCost;
        this.allotedMinutes = 0;
        this.usedMinutes = 0;
        this.overage = 0.0;
        this.totalBill = calculateTotalBill();
    }

    public PhoneBill(int iD, double baseCost, int allotedMinutes, int usedMinutes) {
        this.iD = iD;
        this.baseCost = baseCost;
        this.allotedMinutes = allotedMinutes;
        this.usedMinutes = usedMinutes;
        this.overage = calculateOverage();
        this.totalBill = calculateTotalBill();
    }
// Method to calculate extra minutes
    private double calculateOverage() {
        int extraMinutes = usedMinutes - allotedMinutes;
        if (extraMinutes > 0) {
            return extraMinutes * overageRate;
        } else {
            return 0.0;
        }
    }
// Method to calculate total bill
    private double calculateTotalBill() {
        double total = baseCost + overage;
        return total + (total * taxRate);
    }
// DECLARE GETTERS
    // Getters are used to retrieve the values of the variables 
    //getID
    public int getID() {
        return iD;
    }

    //get baseCost  
    public double getBaseCost() {
        return baseCost;
    }

    //get the total alloted minutes
    public int getAllotedMinutes() {
        return allotedMinutes;
    }


    //get the used minutes
    public int getUsedMinutes() {
        return usedMinutes;
    }

    //get the overage
    public double getOverage() {
        return overage;
    }

    //get the total bill
    // This method calculates the total bill based on base cost, overage, and tax
    public double getTotalBill() {
        return totalBill;
    }
    //DECLARE SETTERS
    //set ID
    public void setID(int iD) {
        this.iD = iD;
    }

    //set baseCost
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
        this.totalBill = calculateTotalBill();
    }

    //setAllotedMinutes and setUsedMinutes are used to update the alloted and used minutes
    // and recalculate overage and total bill accordingly   
    public void setAllotedMinutes(int allotedMinutes) {
        this.allotedMinutes = allotedMinutes;
        this.overage = calculateOverage();
        this.totalBill = calculateTotalBill();
    }

    // setUsedMinutes is used to update the used minutes
    // and recalculate overage and total bill accordingly
    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
        this.overage = calculateOverage();
        this.totalBill = calculateTotalBill();
    }

    // This method is used to set the overage directly
    // and recalculate the total bill accordingly   
    public void setOverage(double overage) {
        this.overage = overage;
        this.totalBill = calculateTotalBill();
    }

    // This method is used to set the total bill directly
    // It is not recommended to set the total bill directly as it is calculated based on other
    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public void printBillDetails() {
        System.out.println("Bill ID: " + iD + "\n" +
                           "Base Cost: $" + baseCost + "\n" +
                           "Alloted Minutes: " + allotedMinutes + "\n" +
                           "Used Minutes: " + usedMinutes + "\n" +
                           "Overage: $" + overage + "\n" +
                           "Total Bill: $" + totalBill);
    }


}
