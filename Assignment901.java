/*
(The Rectangle class) Following the example of the Circle class in Section 9.2, design a class named 
Rectangle to represent a rectangle. The class contains: 
■ Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height. 
■ A no-arg constructor that creates a default rectangle. 
■ A constructor that creates a rectangle with the specified width and height. 
■ A method named getArea() that returns the area of this rectangle. 
■ A method named getPerimeter() that returns the perimeter. 
Draw the UML diagram for the class and then implement the class. Write a test program that creates two Rectangle objects—one with width 4 and 
height 40 and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
*/


public class Assignment901 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 4;
        rectangle1.height = 40;
        System.out.println("Width: "+rectangle1.width+", Height: "+rectangle1.height+", Area: "+rectangle1.getArea()+", Perimeter: "+rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 3.5;
        rectangle2.height = 35.9;
        System.out.println("Width: "+rectangle2.width+", Height: "+rectangle2.height+", Area: "+rectangle2.getArea()+", Perimeter: "+rectangle2.getPerimeter());

    }
}
class Rectangle {
    double width = 1;
    double height = 1;
    Rectangle(){

    }
    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return 2*(width+height);
    }
}
