//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//09/08/2022
//Assignment 3.31

import java.util.Scanner;
public class Assignment331 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count;
        double ex_rate,rmb,dollar; //Exchange rate
        System.out.print("Enter the exchange rate from Dollars to RMB: ");
        ex_rate = input.nextDouble();
        System.out.println();
        System.out.print("Enter 0 to convert Dollars to RMB and 1 vice versa: ");
        count = input.nextInt();
        if(count == 0)
        {
            System.out.print("Enter the Dollar amount: ");
            dollar = input.nextDouble();
            rmb = dollar * ex_rate;
            System.out.println("$"+dollar+" is "+rmb+" yuan");
        }
        else if(count == 1)
        {
            System.out.print("Enter the RMB amount: ");
            rmb = input.nextDouble();
            dollar = rmb/ex_rate;
            System.out.println(rmb+" yuan is $"+dollar);
        }
        else
        {
            System.out.println("Incorrect input");
        }
    }
}
