package oving11_1;

import java.util.Scanner;

/**
 * Klientprogram for å administrere et register over eiendommer.
 */
public class EiendomKlient {
    private static EiendomRegister register = new EiendomRegister();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n-- Eiendomsregister --");
            System.out.println("1. Registrer ny eiendom");
            System.out.println("2. Vis alle eiendommer");
            System.out.println("3. Søk etter eiendom");
            System.out.println("4. Beregn gjennomsnittlig areal");
            System.out.println("0. Avslutt");
            System.out.print("Velg et alternativ: ");

            int valg = lesIntInput();
            if (valg == -1) continue; // Ugyldig input håndtert

            switch (valg) {
                case 1:
                    registrerEiendom();
                    break;
                case 2:
                    visAlleEiendommer();
                    break;
                case 3:
                    sokEtterEiendom();
                    break;
                case 4:
                    beregnGjennomsnittligAreal();
                    break;
                case 0:
                    System.out.println("Avslutter programmet.");
                    return;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        }
    }

    /**
     * Registrerer en ny eiendom i registeret.
     */
    private static void registrerEiendom() {
        System.out.print("Kommunenummer: ");
        int kommunenr = lesIntInput();
        if (kommunenr == -1) return;

        System.out.print("Kommunenavn: ");
        String kommunenavn = scanner.nextLine();

        System.out.print("Gårdsnummer (gnr): ");
        int gnr = lesIntInput();
        if (gnr == -1) return;

        System.out.print("Bruksnummer (bnr): ");
        int bnr = lesIntInput();
        if (bnr == -1) return;

        System.out.print("Bruksnavn (valgfritt): ");
        String bruksnavn = scanner.nextLine();

        System.out.print("Areal (m2): ");
        double areal = lesDoubleInput();
        if (areal == -1) return;

        System.out.print("Navn på eier: ");
        String eier = scanner.nextLine();

        Eiendom eiendom = new Eiendom(kommunenr, kommunenavn, gnr, bnr, bruksnavn, areal, eier);
        register.registrerEiendom(eiendom);
        System.out.println("Eiendom registrert.");
    }

    /**
     * Viser alle eiendommer i registeret.
     */
    private static void visAlleEiendommer() {
        System.out.println("\n-- Alle Eiendommer --");
        register.getAlleEiendommer().forEach(System.out::println);
    }

    /**
     * Søker etter en eiendom i registeret basert på kommunenummer, gårdsnummer og bruksnummer.
     */
    private static void sokEtterEiendom() {
        System.out.print("Kommunenummer: ");
        int kommunenr = lesIntInput();
        if (kommunenr == -1) return;

        System.out.print("Gårdsnummer (gnr): ");
        int gnr = lesIntInput();
        if (gnr == -1) return;

        System.out.print("Bruksnummer (bnr): ");
        int bnr = lesIntInput();
        if (bnr == -1) return;

        Eiendom eiendom = register.finnEiendom(kommunenr, gnr, bnr);
        if (eiendom != null) {
            System.out.println("Fant eiendom: " + eiendom);
        } else {
            System.out.println("Eiendom ikke funnet.");
        }
    }

    /**
     * Beregner og viser gjennomsnittlig areal av alle eiendommer.
     */
    private static void beregnGjennomsnittligAreal() {
        double gjennomsnitt = register.beregnGjennomsnittligAreal();
        System.out.println("Gjennomsnittlig areal: " + gjennomsnitt + " m2");
    }

    /**
     * Les og returner et heltall fra brukeren. Håndterer feil ved ugyldig input.
     * @return Det leste heltallet, eller -1 ved ugyldig input.
     */
    private static int lesIntInput() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ugyldig tall, prøv igjen.");
            return -1;
        }
    }

    /**
     * Les og returner et desimaltall fra brukeren. Håndterer feil ved ugyldig input.
     * @return Det leste desimaltallet, eller -1 ved ugyldig input.
     */
    private static double lesDoubleInput() {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ugyldig desimaltall, prøv igjen.");
            return -1;
        }
    }
}