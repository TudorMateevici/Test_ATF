package org.example;

import java.util.Random;

public class Random_Numbers {

    private static int attempts;

    public static void main(String [] args) {

        Random random = new Random();

        int roll = random.nextInt(6) + 1;
    }

}



