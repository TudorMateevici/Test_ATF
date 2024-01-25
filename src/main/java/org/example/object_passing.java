package org.example;

public class object_passing {

    public static void main(String [] args){

        object_passing_shop shop = new object_passing_shop();

        object_passing_sneakers sneakers = new object_passing_sneakers("Gel Lyte III");

        object_passing_sneakers sneakers1 = new object_passing_sneakers("Mexico 66");

        shop.store(sneakers1);
        shop.store(sneakers);


    }


}
