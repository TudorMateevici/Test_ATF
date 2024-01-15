package org.example;

public class Swap_Variables {
    public static void main(String[] args) {

// Swap variables
        String sneaker1 = "Air Jordan 1";
        String sneaker2 = "Adidas Yeezy 350";
        String box;

        box = sneaker1;
        sneaker1 = sneaker2;
        sneaker2 = box;

        System.out.printf("Box nr.1 = %s\nBox nr.2 = %s\n", sneaker1, sneaker2);
    }
}
