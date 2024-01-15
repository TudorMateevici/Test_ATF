package org.example;

import java.util.ArrayList;

public class For_Each_Loop {

    public static void main(String [] args){

//        String[] brands = {"Nike", "Puma", "Adidas", "New Balance"};

        ArrayList<String> brands = new ArrayList<>();

        brands.add("Nike");
        brands.add("Puma");
        brands.add("Adidas");
        brands.add("New Balance");


        for (String i: brands){
            System.out.println(i);
        }
    }
}
