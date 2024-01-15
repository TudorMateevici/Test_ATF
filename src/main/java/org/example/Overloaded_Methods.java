package org.example;

import java.util.Scanner;

public class Overloaded_Methods {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");

//        int length = scanner.nextInt();

        double length = scanner.nextDouble();


        System.out.println("Enter width: ");

//        int width = scanner.nextInt();

        double width = scanner.nextDouble();

        calculate(length, width);

//        System.out.println("Area = " + calculate(length, width));

        System.out.println("Perimeter = " + calculate(length, width));
    }

    static int calculate(int length, int width  ){

        return length * width;
    }

    static double calculate(double length, double width){

        return 2 * (length + width);
    }
}
