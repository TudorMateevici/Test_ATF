package org.example;

import java.util.Scanner;

public class Logical_Operators {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {

        System.out.println("What is your score?");
        int score = scanner.nextInt();

        if (score == 100) {
            System.out.println("Congratulations!!! You've passed with a perfect score");

        } else if (score > 50 && score < 100) {
            System.out.println("You've passed with a score of: " + score);

        } else {
            System.out.println("Unfortunately, you did not pass.");

        }

        /*System.out.println("Did you passed: Y(y)/N(n)");
        String response = scanner.nextLine();

        if (response.equals("Y") || response.equals("y")) {
            System.out.println("#Congrats!!!");
        } else if (response.equals("N") || response.equals("n")) {
            System.out.println("#Thatisapitty;(");
        } else {
            System.out.println("You alright mate?");
        }*/


    }

}
