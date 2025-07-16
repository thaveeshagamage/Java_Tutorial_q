

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle Kitchen = calculator.getRoom();
        Rectangle Bathroom = calculator.getRoom();

        double area = calculator.CalculateTotalAre(Kitchen, Bathroom);
        System.out.println("Total area of the rooms are " + area+" sqFt12");
        calculator.scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the Width of the Room");
        double width = scanner.nextDouble();
        System.out.println("Enter the Length of the Room");
        double length = scanner.nextDouble();


        return new Rectangle(width,length);


    }
    public double CalculateTotalAre(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
