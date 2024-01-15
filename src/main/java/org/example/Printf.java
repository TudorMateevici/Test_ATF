package org.example;

public class Printf {

    public static void main(String [] args){

        String word = "ai";

        int wholeNumber = 999999999;

        double decimalNumber = 99.99;

        System.out.printf("Word of the day is: %S\n", word);

        System.out.printf("The winning number is: %,d\n", wholeNumber);

        System.out.printf("The price is: %.2f\n", decimalNumber);

    }
}
