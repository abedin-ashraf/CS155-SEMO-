
//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//09/08/2022

//importing Scanner
import java.util.Scanner;
public class Assignment215
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double x1, x2, y1, y2;
        System.out.print("Enter x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        System.out.println("The distance between the two points is "+distance);


    }
}
