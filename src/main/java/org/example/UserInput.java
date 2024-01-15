package org.example;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which are your favourites sneakers?");
        String answer1 = scanner.nextLine();
        System.out.printf("Awesome I also like %s\n", answer1);

        System.out.println("How much you pay for them?");
        int answer2 = scanner.nextInt();
        System.out.printf("%d its a lot for a pair of %s\n", answer2, answer1);

        scanner.close();
    }
}
