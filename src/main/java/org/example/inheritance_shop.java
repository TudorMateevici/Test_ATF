package org.example;

public class inheritance_shop {

    public static void main(String [] args){

//        Create a "shoes" object
        inheritance_shoes shoes = new inheritance_shoes();

//        Create a "trainers" object
        inheritance_trainers trainers = new inheritance_trainers();

//        Create a "boots" object
        inheritance_boots boots = new inheritance_boots();

//
        shoes.type = "hospital shoes";

        shoes.price = 0.00;

        shoes.action();

        trainers.type = "running trainers";

        trainers.price = 49.99;

        trainers.action();

        boots.type = "walking boots";

        boots.price = 59.99;

        boots.action();
    }
}
