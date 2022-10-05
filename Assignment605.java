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
