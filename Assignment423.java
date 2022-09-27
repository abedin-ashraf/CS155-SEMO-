//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//09/17/2022
//Assignment 4.23

import java.util.Scanner;
public class Assignment423 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        float hours = input.nextFloat();
        System.out.print("Enter hourly pay rate: ");
        float payRate = input.nextFloat();
        System.out.print("Enter Federal tax withholding rate: ");
        float federalTax = input.nextFloat();
        System.out.print("Enter State tax withholding rate: ");
        float stateTax = input.nextFloat();

        System.out.println("\n\n");

        System.out.println("Employee Name: "+name);
        System.out.println("Hours Worked: "+hours);
        System.out.printf("Pay Rate: $ %.2f \n",payRate);

        float grossPay=hours*payRate;
        System.out.printf("Gross Pay: $ %.2f \n",grossPay);

        System.out.println("Deductions: ");
        float totalFederal = grossPay*federalTax;
        System.out.println("\t Federal Withholdind ("+federalTax*100+"%): $"+totalFederal);
        float totalState = grossPay*stateTax;
        System.out.println("\t State Withholding ("+stateTax*100+"%): $"+totalState);
        float totalDeduction = totalFederal+totalState;
        System.out.printf("\t Total Deduction: $ %.2f \n",totalDeduction);

        System.out.printf("Net Pay: $ %.2f \n",(grossPay-totalDeduction));
    }
}
