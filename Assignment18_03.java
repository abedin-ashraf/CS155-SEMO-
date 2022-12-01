/*********************************************************************************
* (Compute greatest common divisor using recursion) The gcd(m, n) can also be    *
* defined recursively as follows:                                                *
*                                                                                *
* ■ If m % n is 0, gcd(m, n) is n.                                               *
* ■ Otherwise, gcd(m, n) is gcd(n, m % n).                                       *
*                                                                                *
* Write a recursive method to find the GCD. Write a test program that prompts    *
* the user to enter two integers and displays their GCD.                         *
*********************************************************************************/


import java.util.Scanner;

public class Assignment18_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer to calculate GCD: ");
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());

        System.out.println("The greatest common divisor of "+a+" and "+b+" is "+gcd(a,b));

    }
    public static int gcd(int a, int b){
        if(a%b==0)
            return b;
        else
            return gcd(b, a%b);
    }
}
