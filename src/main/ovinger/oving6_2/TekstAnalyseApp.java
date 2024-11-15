package oving6_2;
import java.util.Scanner;

public class TekstAnalyseApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn teksten du vil analysere: ");
        String tekst = input.nextLine();

        TekstAnalyser analyser = new TekstAnalyser(tekst);

        int totaltBokstaver = analyser.totaltAntallBokstaver();
        System.out.println("Totalt antall bokstaver i teksten: " + totaltBokstaver);

        double prosentSpesialtegn = analyser.prosentIkkeBokstaver();
        System.out.println("Prosent av teksten som er spesialtegn: " + prosentSpesialtegn + "%");

        System.out.print("Skriv inn en bokstav for å finne antall forekomster: ");
        char bokstav = input.next().charAt(0);
        int antallBokstav = analyser.antallForekomsterAvBokstav(bokstav);
        System.out.println("Antall forekomster av '" + bokstav + "': " + antallBokstav);

        String mestBrukt = analyser.mestBrukteBokstav();
        System.out.println(mestBrukt);

        input.close();
    }
}