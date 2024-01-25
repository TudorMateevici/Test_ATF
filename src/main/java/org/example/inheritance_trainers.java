package org.example;

public class inheritance_trainers extends inheritance_shoes{


    @Override
    public void action() {
        System.out.printf("I have %s and they cost %.2f\n", type, price);
    }
}
