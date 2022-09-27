///Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//09/17/2022
//Assignment 4.21

import java.util.Scanner;
public class Assignment421 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();
        if(ssn.charAt(3)=='-'&&ssn.charAt(6)=='-'&&ssn.length()==11)
            System.out.println(ssn+" is a valid social security number.");
        else
            System.out.println(ssn+" is an invalid social security number.");

    }
}
