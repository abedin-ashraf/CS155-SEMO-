//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//08/31/2022

//importing Scanner
import java.util.Scanner;
public class Assignment217
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double windChillTemperature, farenheit, windSpeed;
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F : ");
        farenheit = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        windSpeed = input.nextDouble();

        windChillTemperature = 35.74 + 0.6215*farenheit - 35.75*Math.pow(windSpeed,0.16) + 0.4275*farenheit*Math.pow(windSpeed,0.16);
        System.out.print("The wind chill index is "+windChillTemperature);
    }
}
