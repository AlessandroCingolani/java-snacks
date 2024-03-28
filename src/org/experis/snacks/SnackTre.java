package org.experis.snacks;

public class SnackTre {
    public static void main(String[] args) {
       // Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

        int sumNumbers = 0;

        //array numbers
        int[] arrayNumbers = {3,5,6,7,21,32,12};

        //array somma elementi in posizione dispari
        for (int i = 0; i < arrayNumbers.length; i++) {
            if(i % 2 != 0){
                sumNumbers += arrayNumbers[i];
            }
        }
        System.out.println(sumNumbers);
    }
}
