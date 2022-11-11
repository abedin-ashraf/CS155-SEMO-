/*********************************************************************************
* (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented *
* using composition. Define a new stack class that extends ArrayList.            *
* Draw the UML diagram for the classes and then implement MyStack. Write a test  *
* program that prompts the user to enter five strings and displays them in       *
* reverse order.                                                                 *
*********************************************************************************/

import java.util.Scanner;

public class Assignment11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack1 stack = new MyStack1();

        System.out.println("Enter five strings: ");
        for(int i=0; i<5; i++){
            stack.push(input.next());
        }
        System.out.println("Stack: "+stack.toString());
    }
}

class MyStack1 extends java.util.ArrayList{
    private java.util.ArrayList<Object> list;

    public MyStack1(){
        list = new java.util.ArrayList<Object>();
    }

    public void push(Object object){
        list.add(0,object);
    }
    public Object peek(){
        return list.get(0);
    }
    public Object pop(){
        Object object2 = list.get(0);
        list.remove(0);
        return object2;
    }

    @Override
    public String toString(){
        return "stack: " + list.toString();
    }


}
