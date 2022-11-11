/*********************************************************************************
* (Use ArrayList) Write a program that creates an ArrayList and adds a Loan      *
* object, a Date object, a string, and a Circle object to the list, and use a    *
* loop to display all the elements in the list by invoking the object’s          *
* toString() method.                                                             *
*********************************************************************************/

import java.util.ArrayList;
import java.util.Date;

public class Assignment11_06 {
    public static void main(String[] args) {
        ArrayList<Object>  object = new ArrayList<Object>();

        object.add(new Loan());
        object.add(new Date());
        object.add(new String("String class"));
        object.add(new Circle());

        for(int i=0; i<object.size(); i++){
            System.out.println((object.get(i)).toString());
        }
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(4.5, 2, 3000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount=loanAmount;
    }
    public java.util.Date getLoanDate(){
        return loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));

        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

}
class Circle{
    private double radius = 1;
    private static int numberOfObjects = 0;

    public Circle(){
        numberOfObjects++;
    }
    public Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = (newRadius >= 0)? newRadius :0;

    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}