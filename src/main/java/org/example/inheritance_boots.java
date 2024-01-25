package org.example;

public class inheritance_boots extends inheritance_shoes{

    @Override
    public void action (){
        System.out.printf("This are my %s and they cost: %.2f", type, price);
    }
}
