package org.experis.snacks;

import java.util.Scanner;

public class SnackUno {
    public static void main(String[] args) {
        // Chiedi all’utente di continuare ad inserire un numero pari compreso tra 10 e 20.
        // Se il numero non corrisponde alla richiesta continuare a chiederlo fino a che non viene inserito un numero valido.

        int userSelection;

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero pari ta 10 e 20: ");
        userSelection = scan.nextInt();

        while (userSelection < 10 || userSelection > 20 || userSelection % 2 != 0){
            System.out.print("Inserisci un numero pari ta 10 e 20: ");
            userSelection = scan.nextInt();
        }
        System.out.println("Il numero " + userSelection + " è compreso tra 10 e 20 ed è paro");
        scan.close();
    }
}
