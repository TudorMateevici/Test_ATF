package org.example;

public class array_of_objects {

    public static void main(String[] args) {

        array_of_objects_sneakers store1 = new array_of_objects_sneakers("Jordan");
        array_of_objects_sneakers store2 = new array_of_objects_sneakers("Nike");
        array_of_objects_sneakers store3 = new array_of_objects_sneakers("Adidas");

        array_of_objects_sneakers[] store = {store1, store2, store3};

        System.out.println(store[0].brand);
        System.out.println(store[1].brand);
        System.out.println(store[2].brand);


    }
}
