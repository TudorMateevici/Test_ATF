package org.example;

public class overloaded_constructors {

    public static void main(String [] arg){


        overloaded_constructors_sneakers sneakers = new overloaded_constructors_sneakers(50);

        System.out.printf("Brand: %S\nModel: %s\nPrice: %.2f MSRP\n", sneakers.brand, sneakers.model, sneakers.price);

        System.out.printf("Discount: %d%%", sneakers.discount);
    }


}
