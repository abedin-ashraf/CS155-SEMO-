/*
 (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix 
using the following header: Here is a sample run:
public static int printMatrix(int year)
that prompts the user to enter n and displays an n-by-n matrix. Here is a sample run:
    Enter n: 3
        0 1 0
        0 0 0
        1 1 1
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that 
prompts the user to enter n and displays an n-by-n matrix.
 */

//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//10/05/2022
//Assignment 6.17

import java.util.Random;
import java.util.Scanner;
public class Assignment617 {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    public static void printMatrix(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(random.nextDouble() < 0.5)
                    System.out.print("0\t");
                else
                    System.out.print("1\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.print("Enter a number to get a n*n matrix: ");
        int n = input.nextInt();
        System.out.println();
        printMatrix(n);
    }
}
