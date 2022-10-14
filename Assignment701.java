/*
 Assign grades) Write a program that reads student scores, gets the best score, and 
then assigns grades based on the following scheme:
    Grade is A if score is Ú best -10;
    Grade is B if score is Ú best -20;
    Grade is C if score is Ú best -30;
    Grade is D if score is Ú best -40;
    Grade is F otherwise.
 The program prompts the user to enter the total number of students, then prompts 
the user to enter all of the scores, and concludes by displaying the grades. Here is 
a sample run:
    Enter the number of students: 4
    Enter 4 scores: 40 55 70 58 
    Student 0 score is 40 and grade is C
    Student 1 score is 55 and grade is B
    Student 2 score is 70 and grade is A
    Student 3 score is 58 and grade is 
 */

import java.util.Scanner;
public class Assignment701 {


    public static void gpa(double[] arr){
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=(max-10))
                System.out.println("Student "+i+" score is "+arr[i]+" and grade is A.");
            else if(arr[i]>=(max-20))
                System.out.println("Student "+i+" score is "+arr[i]+" and grade is B.");
            else if(arr[i]>=(max-30))
                System.out.println("Student "+i+" score is "+arr[i]+" and grade is C.");
            else if(arr[i]>=(max-40))
                System.out.println("Student "+i+" score is "+arr[i]+" and grade is D.");
            else
                System.out.println("Student "+i+" score is "+arr[i]+" and grade is F.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        double[] scores = new double[numberOfStudents];
        System.out.print("Enter "+numberOfStudents+" scores: ");
        for(int i=0; i<numberOfStudents; i++){
            scores[i]=input.nextDouble();
        }
        gpa(scores);
    }

}
