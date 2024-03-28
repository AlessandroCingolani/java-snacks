package org.experis.snacks;

import java.util.Scanner;

public class SnackQuattro {
    public static void main(String[] args) {
        // Data in input una stringa verificare se è palindroma

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la parola per verificare se è palindroma : ");

        String userWord = scan.nextLine();

        //prendo input utente e lo trasformo in lower case
        String wordUserLower = userWord.toLowerCase();

        // trasformo la parola in char array

        char[] chars = wordUserLower.toCharArray();

        String reverseWord = "";

        //ciclo la parola char al contrario per controllare
        for (int i = chars.length -1; i >= 0; i--) {
            reverseWord = reverseWord + chars[i];
        }

        // controllo stringa reverse con la parola user
        if(wordUserLower.equals(reverseWord)){
            System.out.println("La parola " + userWord + " è palindroma");
        }else {
            System.out.println("La parola " + userWord + " NON è palindroma");
        }

    }
}
