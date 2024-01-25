package org.example;

public class objects_OOP_sneakers {

    String brand;
    String model;
    Double price;

    objects_OOP_sneakers(String brand, String model, double price){

        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void hoop() {
        System.out.println(this.brand + " " + this.model + " " + "are hopping sneakers");
    }
    void run(){
        System.out.printf("%s %s are running sneakers",this.brand, this.model);
    }
}
