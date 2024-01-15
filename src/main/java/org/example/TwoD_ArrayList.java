package org.example;

public class TwoD_ArrayList {

    public static void main(String [] args){

        String[][] topSportBrands = {
                {"1", "Adidas"},
                {"2", "Nike"},
                {"3", "Puma"},
                {"4", "New Balance"},
                {"5", "Reebok"}
        };

        for(int i=0; i< topSportBrands.length; i++){
            System.out.println();
            for(int j= 0; j<topSportBrands[i].length; j++)
            {System.out.print(topSportBrands[i][j] + " ");
            }

        }
    }
}
