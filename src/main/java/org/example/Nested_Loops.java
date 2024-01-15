package org.example;

import java.util.Scanner;

public class Nested_Loops {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("How many rows?");
        rows = scanner.nextInt();
        System.out.println("How many columns?");
        columns = scanner.nextInt();
        System.out.println("Whats the symbol?");
        symbol = scanner.next();

        for(int i = 1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
