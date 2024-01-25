package org.example;

public class overloaded_constructors_sneakers {

    String brand;
    String model;
    double price;
    int discount;

    public overloaded_constructors_sneakers(String brand,String model, double price) {

        this.brand = brand;
        this.model = model;
        this.price = price;

    }
    public overloaded_constructors_sneakers(int discount){
        this.discount = discount;
    }
}
