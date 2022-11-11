/*
 (Find the smallest element) Write a method that finds the smallest element in an 
array of double values using the following header:
        public static double min(double[] array)
Write a test program that prompts the user to enter 10 numbers, invokes this 
method to return the minimum value, and displays the minimum value. Here is a 
sample run of the program:
    Enter 10 numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
    The minimum number is 1.
 */
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
