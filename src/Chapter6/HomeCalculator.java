

public class HomeCalculator {

    public static void main(String args[]){

        /*****************************
         * RECTANGLE 1
         ******************************/

        //Create Instance of Rectangle 1

        Rectangle Room1 = new Rectangle();
        Room1.setWidth(25);
        Room1.setLength(50);
        double AreaOfRoom1 = Room1.calculateArea();

        /*****************************
         * RECTANGLE 2
         ******************************/
        Rectangle Room2 = new Rectangle(30,75);
        double AreaOfRoom2 = Room2.calculateArea();

        double TotalArea = AreaOfRoom1 + AreaOfRoom2;

        System.out.println("Total are of Rooms is "+ TotalArea + "SqFt");

    }
}
