package oving1_2;

import java.util.Scanner; // importerer den som skanner input fra bruker

public class Oppgave1_2 {
    public static void main(String[] args) {
        // Henter inn en scanner som kan lese input
        Scanner scanner = new Scanner(System.in);

        // Ber brukeren om å skrive inn antall sekunder
        System.out.print("Skriv inn antall sekunder: ");
        int sekunder = scanner.nextInt(); //kjører en double her da bruker muligens ønsker å legge inn mange desimaler, og velger next for å hente forrige linje

        // Konvertering fra sekunder til hele timer med heltallsdivisjon (1 time = 3600 sek)
        int time = sekunder / 3600; // definerer formel fra sekunder til timer

        // Beregne resterende sekunder etter dividert over
        int resterendesekunder = sekunder % 3600;

        // Resterende sekunder til antall minutter
        int minutter = resterendesekunder / 60;

        // Beregne resterende sekunder etter dividert over
        int resterendesekunder2 = resterendesekunder % 60;


        // Viser resultatet med å legge sammen alt
        System.out.println( sekunder + "sekunder" + " er " + time + "timer" + minutter + "minutter" + resterendesekunder2 + "sekunder");

    }
}