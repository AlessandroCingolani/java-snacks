package org.experis.snacks;

import java.util.Scanner;

public class SnackBonusSei {
    public static void main(String[] args) {
        //Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata nel formato “hh:mm:ss”
        //Cominciate ad usare il debugger per testare il codice dei vostri esercizi…il debugger è il nostro migliore amico

        String format = "hh:mm:ss";

        Scanner scan = new Scanner(System.in);

        System.out.print("Digita il numero di secondi che vuoi convertire in hh:mm:ss :");
        int totalSeconds = Integer.parseInt(scan.nextLine());


        // Calcolo delle ore, dei minuti e dei secondi
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        //formatto con string format
        String formatHours = String.format("%02d",hours);
        String formatMinutes = String.format("%02d",minutes);
        String formatSeconds = String.format("%02d",seconds);

        //testato il replace per rimpiazzare il format della stringa esistente
        String newFormat = format.replace("hh", formatHours)
                .replace("mm", formatMinutes)
                .replace("ss",formatSeconds);

        System.out.println(newFormat);

    }
}
