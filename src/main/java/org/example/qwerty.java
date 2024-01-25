package org.example;

import java.util.Scanner;

public class qwerty {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter money amount in MDL:");

        double amountMDL = scanner.nextDouble();

        System.out.println("Choose conversion currency (EUR/USD):");

        String conversionCurrency = scanner.next();

        System.out.println("Enter foreign currency value per 1 unit: ");

        double foreignCurrencyValue = scanner.nextDouble();

        scanner.close();

        if(conversionCurrency.equals("EUR")){
            convertor (amountMDL, foreignCurrencyValue, conversionCurrency);
        }
        else if (conversionCurrency.equals("USD")){
            convertor (amountMDL, foreignCurrencyValue, conversionCurrency);
        }
        else{
            System.out.println("Wrong conversion currency entered");
        }

    }

    static void convertor(double amountMDL, double foreignCurrencyValue, String conversionCurrency ){
        System.out.println("Your amount is: " + amountMDL / foreignCurrencyValue + conversionCurrency);
    }
}
