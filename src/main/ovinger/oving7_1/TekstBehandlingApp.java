package oving7_1;

import java.util.Scanner;

public class TekstBehandlingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn teksten du vil analysere: ");
        String tekst = scanner.nextLine();

        TekstBehandling behandling = new TekstBehandling(tekst);

        System.out.println("Antall ord i teksten: " + behandling.finnAntallOrd());
        System.out.println("Gjennomsnittlig ordlengde: " + behandling.gjennomsnittligOrdlengde());
        System.out.println("Gjennomsnittlig antall ord: " + behandling.gjennomsnittligOrdPerPeriode());

        System.out.print("Skriv inn ordet du vil skifte ut: ");
        String gammeltOrd = scanner.next();
        System.out.print("Skriv inn det nye ordet: ");
        String nyttOrd = scanner.next();

        String nyTekst = behandling.skiftUtOrd(gammeltOrd, nyttOrd);
        System.out.println("Teksten etter utskifting: " + nyTekst);
        System.out.println("Teksten i store bokstaver: " + behandling.hentTekstMedStoreBokstaver());

        scanner.close();
    }
}