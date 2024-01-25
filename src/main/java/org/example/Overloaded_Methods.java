package org.example;

import java.util.Scanner;

public class Overloaded_Methods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rectangle length:");

        int length = scanner.nextInt();

        System.out.println("Enter rectangle width:");

        int width = scanner.nextInt();

        System.out.println("Enter rectangle height");

        int height = scanner.nextInt();

        calculate(length, width);

        calculate(length, width, height);
    }
     static void calculate(int length, int width) {
        System.out.println("Rectangle area = " + length * width);
    }
    static void calculate(int length,int width,int height){
        System.out.println("Rectangle volume = " + length * width * height);
    }
}

