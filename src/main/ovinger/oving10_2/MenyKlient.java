package oving10_2;

import java.util.List;
import java.util.Scanner;

public class MenyKlient {
    private static MenyRegister register = new MenyRegister();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Registrer ny rett");
            System.out.println("2. Finn rett etter navn");
            System.out.println("3. Finn retter av en bestemt type");
            System.out.println("4. Registrer ny meny");
            System.out.println("5. Finn menyer innenfor prisintervall");
            System.out.println("0. Avslutt");
            System.out.print("Velg et alternativ: ");
            int valg = scanner.nextInt();
            scanner.nextLine(); // konsumere newline

            switch (valg) {
                case 1:
                    registrerRett();
                    break;
                case 2:
                    finnRett();
                    break;
                case 3:
                    finnRetterAvType();
                    break;
                case 4:
                    registrerMeny();
                    break;
                case 5:
                    finnMenyerInnenforIntervall();
                    break;
                case 0:
                    System.out.println("Avslutter programmet.");
                    return;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        }
    }

    private static void registrerRett() {
        System.out.print("Navn: ");
        String navn = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Pris: ");
        double pris = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Oppskrift: ");
        String oppskrift = scanner.nextLine();
        Rett rett = new Rett(navn, type, pris, oppskrift);
        register.registrerRett(rett);
        System.out.println("Rett registrert.");
    }

    private static void finnRett() {
        System.out.print("Navn: ");
        String navn = scanner.nextLine();
        Rett rett = register.finnRett(navn);
        if (rett != null) {
            System.out.println("Fant rett: " + rett);
        } else {
            System.out.println("Rett ikke funnet.");
        }
    }

    private static void finnRetterAvType() {
        System.out.print("Type: ");
        String type = scanner.nextLine();
        List<Rett> retter = register.finnRetterAvType(type);
        if (retter.isEmpty()) {
            System.out.println("Ingen retter av denne typen funnet.");
        } else {
            retter.forEach(System.out::println);
        }
    }

    private static void registrerMeny() {
        Meny meny = new Meny();
        while (true) {
            System.out.print("Legg til rett ved navn (eller skriv 'ferdig' for å avslutte): ");
            String navn = scanner.nextLine();
            if (navn.equalsIgnoreCase("ferdig")) {
                break;
            }
            Rett rett = register.finnRett(navn);
            if (rett != null) {
                meny.leggTilRett(rett);
                System.out.println("Rett lagt til i meny.");
            } else {
                System.out.println("Rett ikke funnet.");
            }
        }
        register.registrerMeny(meny);
        System.out.println("Meny registrert.");
    }

    private static void finnMenyerInnenforIntervall() {
        System.out.print("Minstepris: ");
        double minPris = scanner.nextDouble();
        System.out.print("Makspris: ");
        double maxPris = scanner.nextDouble();
        scanner.nextLine(); // konsumere newline
        List<Meny> menyer = register.finnMenyerInnenforIntervall(minPris, maxPris);
        if (menyer.isEmpty()) {
            System.out.println("Ingen menyer funnet innenfor prisintervall.");
        } else {
            menyer.forEach(System.out::println);
        }
    }
}