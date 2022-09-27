//Mohammed Nurul Abedin Ashraf
//CS-155(The Fundamental of Computer Programming)
//Dr. Art Kazmierczak (Dr. K)
//09/08/2022
//Assignment 3.33

import java.util.Scanner;
public class Assignment333 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pack1_weight,pack1_price,pack2_weight,pack2_price;
        System.out.print("Enter weight and price for package 1: ");
        pack1_weight = input.nextDouble();
        pack1_price = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        pack2_weight = input.nextDouble();
        pack2_price = input.nextDouble();

        double pack1PricePerWeight = pack1_price/pack1_weight;
        double pack2PricePerWeight = pack2_price/pack2_weight;
        if(pack1PricePerWeight==pack2PricePerWeight)
            System.out.println("Two packages have the same price.");
        else if(pack1PricePerWeight>pack2PricePerWeight)
            System.out.println("Package 2 has a better price.");
        else
            System.out.println("Package 1 has better price");
    }
}
