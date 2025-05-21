package Chapter6;

public class Rectangle {

    double length;
    double width;

    //Default Constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }

    //Constructor to add parameters
    public Rectangle(double width, double length){
        this.length = length;
        setWidth(width);

    }


    //Get the stored length value
    double getLength() {
        return length;
    }
    //Set length from User
    void setLength(double length){
            this.length =length;
    }
    //Get the stored width value
    double getWidth(){
        return width;
    }
    //Set width from User
    void setWidth(double width){
        this.width = width;
    }

    //Calculate Perimeter
    double calculatePerimeter(){
            return (2 * length) + (2 * width);
    }
    //Calculate Area
    double calculateArea(){
        return width * length;
    }
}
