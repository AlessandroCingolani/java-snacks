package org.experis.snacks;


import java.util.Random;

public class SnackDue {
    public static void main(String[] args) {
        // Generatore di “nomi cognomi” casuali:
        // il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        // e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

        final int listMember = 10;

        // Array names
        String[] names = {"Mario", "Luigi", "Paola", "Giulia", "Giovanni"};

        // Array surname
        String[] surname = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari"};

        Random random = new Random();

        //stampo n nomi e cognomi
        for (int i = 0; i < listMember; i++) {
            int randomName= random.nextInt(names.length);
            int randomSurname= random.nextInt(names.length);
            System.out.println(names[randomName] + " " + surname[randomSurname]);
        }

    }
}
