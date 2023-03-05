/*********************************************************************************
* (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.   *
* Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2) and   *
* fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci numbers. The *
* current Fibonacci number would then be f0 + f1. The algorithm  can be          *
* described as follows:                                                          *
*                                                                                *
* f0 = 0; // For fib(0)                                                          *
* f1 = 1; // For fib(1)                                                          *
*                                                                                *
* for (int i = 1; i <= n; i++) {                                                 *
* 		currentFib = f0 + f1;                                                      *
* 		f0 = f1;                                                                   *
* 		f1 = currentFib;                                                           *
* }                                                                              *
* // After the loop, currentFib is fib(n)                                        *
*                                                                                *
* Write a test program that prompts the user to enter an index and displays its  *
* Fibonacci number.                                                              *
*********************************************************************************/

import java.util.Scanner;

public class Assignment18_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an index for fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The fibonacci number at index "+index+" is "+fibonacci(index));
    }

    public static long fibonacci(long index){
        long fib0 = 0;
        long fib1 = 1;

        long currentFib = 0;

        if(index == 0)
            return fib0;
        else if(index == 1)
            return fib1;
        else{
            for(int i=1; i<index; i++){
                currentFib = fib0 + fib1;
                fib0 = fib1;
                fib1 = currentFib;
            }
            return currentFib;
        }
    }
}
