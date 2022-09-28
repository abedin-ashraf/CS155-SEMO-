//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//Assignment 5.21
//09-28-2022

import java.util.Scanner;
public class Assignment521 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextFloat();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        double monthlyPayment, totalPayment;
        System.out.println("Interest Rate\t Monthly Payment\t Total Payment");
        for(double i = .05; i< .08125; i+=0.00125){
            monthlyPayment = (loanAmount *(i/12) / (1-1/Math.pow(1+(i/12),years*12)));
            totalPayment = monthlyPayment * years * 12;
            System.out.printf(String.format("%.3f",i*100)+"\t\t\t "+String.format("%.2f",monthlyPayment)+"\t\t\t\t "+ String.format("%.2f",totalPayment)+"\n");

        }
    }
}
