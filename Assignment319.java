//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//09/08/2022
//Assignment 3.19

import java.util.Scanner;
public class Assignment319 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Taking input from user
        System.out.println("Enter the edges of a triangle to calculate it's perimeter");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        //Checking if a triangle or not and if triangle then print the perimeter
        if(edge1>edge2 && edge1>edge3 && edge1<(edge2+edge3))
            System.out.println("It's a triangle and it's perimeter is "+(edge1+edge2+edge3));
        else if(edge2>edge1 && edge2>edge3 && edge2<(edge1+edge3))
            System.out.println("It's a triangle and it's perimeter is "+(edge1+edge2+edge3));
        else if(edge3>edge1 && edge3>edge2 && edge3<(edge1+edge2))
            System.out.println("It's a triangle and it's perimeter is "+(edge1+edge2+edge3));
        else
            System.out.println("It's not a triangle because input is invalid.");
    }
}
