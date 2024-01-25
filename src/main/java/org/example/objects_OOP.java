package org.example;

public class objects_OOP {

    public static void main(String [] args){

        objects_OOP_sneakers mySneaker = new objects_OOP_sneakers("Jordan", "Delta", 99.99);

        objects_OOP_sneakers my2ndSneaker = new objects_OOP_sneakers("Asics", "Gel Lyte III", 49.99);

        System.out.println(mySneaker.model);

        System.out.println(my2ndSneaker.model);

        mySneaker.hoop();
        my2ndSneaker.run();
    }
}
