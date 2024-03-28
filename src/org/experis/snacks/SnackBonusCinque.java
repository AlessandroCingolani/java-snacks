package org.experis.snacks;

import java.util.Scanner;

public class SnackBonusCinque {
    public static void main(String[] args) {
        //Data una stringa in input mostrare a video quanti caratteri alfabetici contiene,
        // quanti numeri e quanti simboli non alfanumerici.
        // variabili
        int alphabetic = 0;
        int numeric = 0;
        int simbols = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la parola/frase per conteggiare caratteri numeri e simboli:");
        String userInput = scan.nextLine().trim();

        // array char
        char[] arrayChar = userInput.toCharArray();

        //ciclo e aumento il conteggio dei singoli char
        for (int i = 0; i < arrayChar.length; i++) {
            if(Character.isAlphabetic(arrayChar[i])){
                alphabetic++;
            } else if (Character.isDigit(arrayChar[i])) {
                numeric++;
            } else {
                simbols++;
            }
        }

        System.out.println("Numero caratteri alfabetici: " + alphabetic);
        System.out.println("Totale numeri: " + numeric);
        System.out.println("Simboli non alfanumerici: " + simbols);

        scan.close();
    }
}
