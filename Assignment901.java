//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//10/21/2022
//Assignment 9.1

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
