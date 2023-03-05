/*
 (Sort three numbers) Write a method with the following header to display three 
numbers in increasing order:
public static void displaySortedNumbers(
 double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the 
method to display them in increasing order.
 */


//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//10/05/2022
//Assignment 6.5

import java.util.Scanner;
public class Assignment605 {
    public static void displaySortedNumber(double num1, double num2, double num3) {
        System.out.println("Sorted Numbers: ");
        if (num1 < num2 && num1 < num3) {
            System.out.print(num1 + "\t");
            if (num2 < num3) {
                System.out.print(num2 + "\t");
                System.out.print(num3 + "\t");
            } else {
                System.out.print(num3 + "\t");
                System.out.print(num2 + "\t");
            }
        }
        else if(num2<num1 && num2<num3) {
            System.out.print(num2 + "\t");
            if(num3<num1){
                System.out.print(num3 + "\t");
                System.out.print(num1 + "\t");
            }
            else{
                System.out.print(num1 + "\t");
                System.out.print(num3 + "\t");
            }
        }
        else{
            System.out.print(num3 + "\t");
            if(num2<num1){
                System.out.print(num2 + "\t");
                System.out.print(num1 + "\t");
            }
            else{
                System.out.print(num1 + "\t");
                System.out.print(num2 + "\t");
            }
        }
    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Enter three number to get sorted number");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        displaySortedNumber(num1,num2,num3);
    }
}
