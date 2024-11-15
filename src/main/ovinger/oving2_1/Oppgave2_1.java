package oving2_1;

import java.util.Scanner;

public class Oppgave2_1 {
    public static void main(String[] args) {
        //Henter inn en scanner som kan lese input
        Scanner scanner = new Scanner(System.in);

        // Ber brukeren om å skrive inn hvilket år
        System.out.print("Skriv inn årstall:");
        int årstall = scanner.nextInt(); // definerer årstall og henter inn bruker-input

        // Sjekker om årstallet er skuddår


        if (årstall % 400==0) {
            System.out.println(årstall + " er ett skuddår");

        } else if (årstall % 100 == 0) {
            System.out.println(årstall + " er ikke et skuddår.");

        } else if (årstall % 4 == 0) {
            System.out.println(årstall + " er et skuddår.");

        } else {
            System.out.println(årstall + " er ikke et skuddår.");
        }
        scanner.close();


    }
}