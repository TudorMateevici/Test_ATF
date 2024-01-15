package org.example;

public class Math_Class {
    public static void main(String [] args){

        double price = 99.99;
        double discount = 50;
//        double discountedPrice = (price * discount)/100;
//        String roundedDiscountedPrice = String.format("%.2f",discountedPrice);

        double discountedPrice = Math.round((price * discount)/100);

//        double discountedPrice = Math.floor((price * discount)/100);

//        double discountedPrice = Math.ceil((price * discount)/100);

//        System.out.printf("Your final price is: %.2f", discountedPrice);

//        System.out.println("Your final price is: " + roundedDiscountedPrice);

        System.out.println("Discounter price is: " + String.format("%.2f",discountedPrice));

    }
}
