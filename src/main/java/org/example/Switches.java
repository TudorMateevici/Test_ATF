package org.example;

import java.util.Scanner;

public class Switches {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What day is today?");
        String weekDay = scanner.nextLine();

        switch (weekDay){
            default:
                System.out.println("You sure that its a day lad?");
                break;
            case "Monday":
                System.out.println("Its Monday mate!!!");
                break;
            case "Tuesday":
                System.out.println("Its Tuesday...");
                break;
            case "Wednesday":
                System.out.println("Its the middle of the week");
                break;
            case "Thursday":
                System.out.println("Its Thursday in it ;)");
                break;
            case "Friday":
                System.out.println("TGIF");
                break;
            case "Saturday":
                System.out.println("Day off");
                break;
            case "Sunday":
                System.out.println("What?");

        }
    }
}
