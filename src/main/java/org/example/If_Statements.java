package org.example;

import java.util.Scanner;

public class If_Statements {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the price?");
        double price = scanner.nextDouble();

        if(price > 99.99){
            System.out.println("Price over retail");
        }
        else if(price == 99.99){
            System.out.println("This is the retail price");
        }
        else{
            System.out.println("Price below retail");
        }
        scanner.close();
    }
}
