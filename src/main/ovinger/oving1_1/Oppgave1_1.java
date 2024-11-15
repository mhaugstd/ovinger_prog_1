package oving1_1;

import java.util.Scanner; // Importer Scanner-klassen for input

public class Oppgave1_1 {
    public static void main(String[] args) {
        // Opprett en Scanner for å lese brukerinput
        Scanner scanner = new Scanner(System.in);

        // Be brukeren om å skrive inn antall tommer
        System.out.println("Legg inn antall tommer her:");

        // Les inn brukerens input
        double tommer = scanner.nextDouble();

        // Konverter tommer til centimeter
        double centimeter = tommer * 2.54;

        // Skriv ut resultatet
        System.out.println(tommer + " tommer er lik " + centimeter + " centimeter.");

        // Lukk Scanneren
        scanner.close();
    }
}