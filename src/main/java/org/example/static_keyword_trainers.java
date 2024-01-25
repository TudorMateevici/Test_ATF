package org.example;

public class static_keyword_trainers {

    static String model;

    static int numberOfTrainers;

    static_keyword_trainers(String model){
        static_keyword_trainers.model = model;
        numberOfTrainers++;
    }
    static void quantity(){
        System.out.printf("I have %s pair(s) of trainers\n", numberOfTrainers);
    }

}
