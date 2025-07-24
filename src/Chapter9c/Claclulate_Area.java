package Chapter9c;

public class Claclulate_Area {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(5);
        rectangle1.setWidth(10);
        System.out.println("Rectangle Perimeter: " + rectangle1.calculatePerimeter());

        Square square1 = new Square();
        square1.setLength(4);  
        square1.setSides(4);
        System.out.println("Square Perimeter: " + square1.calculatePerimeter());
        rectangle1.print();
        square1.print("this is a square");
        square1.print();
    }

}
