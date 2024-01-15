package org.example;

import java.util.Scanner;

public class While_Loop {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.println("Oi, who r u?");
            name = scanner.nextLine();
        }
        System.out.printf("Oi %s", name);

        /*do{
            System.out.println("Oi, who r u?");
            name = scanner.nextLine();
        }while (name.isEmpty())
        System.out.printf("Oi %s", name);*/
    }
}

