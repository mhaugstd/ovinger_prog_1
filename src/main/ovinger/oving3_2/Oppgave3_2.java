package oving3_2;

import java.util.Scanner;
public class Oppgave3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char fortsette; // Variabel for å kontrollere om brukeren vil fortsette

        // Hovedløkken som gjør det mulig å analysere flere tall
        do {
            // Be brukeren om å skrive inn et tall
            System.out.print("Skriv inn et tall for å sjekke om det er et primtall: ");
            int tall = scanner.nextInt();

            // Kall metoden for å sjekke om tallet er et primtall
            if (erPrimtall(tall)) {
                System.out.println(tall + " er et primtall.");
            } else {
                System.out.println(tall + " er ikke et primtall.");
            }

            // Spør om brukeren vil sjekke et nytt tall
            System.out.print("Vil du sjekke et annet tall? (j/n): ");
            fortsette = scanner.next().charAt(0);
        } while (fortsette == 'j' || fortsette == 'J');

        System.out.println("Programmet avsluttes.");
        scanner.close();
    }

    // Metode som sjekker om tallet er et primtall
    public static boolean erPrimtall(int n) {
        if (n <= 1) {
            return false; // Tall mindre enn eller lik 1 er ikke primtall
        }

        // Sjekk om tallet er delelig med noen tall mellom 2 og kvadratroten av n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Ikke et primtall hvis det er delelig med i
            }
        }

        return true; // Tallet er et primtall
    }
}