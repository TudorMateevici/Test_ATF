package org.example;

public class static_keyword {

    public static void main(String[] args) {

        static_keyword_trainers trainer1 = new static_keyword_trainers("Jordan XII");
        static_keyword_trainers trainer2 = new static_keyword_trainers("Jordan XIV");
        static_keyword_trainers trainer3 = new static_keyword_trainers("Jordan XXXVIII");

        static_keyword_trainers.quantity();
        System.out.println("My favourite is" + trainer1.model);

    }
}


