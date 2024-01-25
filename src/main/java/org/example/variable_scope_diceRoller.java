package org.example;

import java.util.Random;

public class variable_scope_diceRoller {

    Random random = new Random();
    int randomNumber;

    variable_scope_diceRoller(){
        roll();
    }

    void roll(){
        randomNumber = random.nextInt(6)+1;
        System.out.printf("You've rolled %d", randomNumber);
    }

    /*variable_scope_diceRoller(){
        Random random = new Random();
        int randomNumber = 0;
        roll(random, randomNumber);
    }

    void roll(Random random, int randomNumber){
        randomNumber = random.nextInt(6)+1;
        System.out.println(randomNumber);


    }*/
}
