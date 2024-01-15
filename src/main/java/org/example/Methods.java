package org.example;

import java.util.Scanner;

public class Methods {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What are those?");

        String model = scanner.nextLine();

        System.out.println("How much are those?");

        double price = scanner.nextInt();

        System.out.println("Do you have discount?");

        double discount = scanner.nextInt();

        trainer(model, price);

        discountedPrice(price, discount);

        System.out.println("Discounted price: " + discountedPrice(price, discount));
    }

    static void trainer (String model, double price){
        System.out.printf("#%s!!!\n", model);
        System.out.printf("Price: %.2f MSRP\n", price);
    }

    static double discountedPrice (double price, double discount){

        return price - (price * discount /100);

    }
}
