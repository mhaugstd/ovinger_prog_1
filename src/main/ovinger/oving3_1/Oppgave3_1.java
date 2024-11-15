package oving3_1;

import java.util.Scanner;

public class Oppgave3_1 {
    public static void main(String[] args) {

        //Henter inn en scanner som kan lese input
        Scanner scanner = new Scanner(System.in);

        // Ber brukeren om å skrive inn hvilken gangetabell som er start
        System.out.print("Skriv inn hvilken gangetabell du ønsker å starte med");
        int gangetabell_start = scanner.nextInt(); // definerer gangetabell og henter inn bruker-input

        // Ber brukeren om å skrive inn hvilken gangetabell som er slutt
        System.out.print("Skriv inn hvilken gangetabell du ønsker å avslutte med");
        int gangetabell_slutt = scanner.nextInt(); // definerer gangetabell og henter inn bruker-input

        // Lager en løkke for å skrive ut gangetabellen for hvert tall ønskelig

        for (int i = gangetabell_start; i <= gangetabell_slutt; i++) {
            System.out.println(i + "-gangen:");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        scanner.close();
    }

}