//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//10/14/2022
//Assignment 7.9

import java.util.Scanner;
public class Assignment709 {


    public static double min(double[] arr){
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for(int i=0; i<10; i++){
            numbers[i]=input.nextDouble();
        }
        double minNumbers = min(numbers);
        System.out.println("The minimum number is "+minNumbers);
    }

}
