package oving10_1;

import java.util.List;
import java.util.Scanner;

public class ArrangementKlient {
    private static ArrangementRegister register = new ArrangementRegister();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Registrer nytt arrangement");
            System.out.println("2. Finn arrangementer på sted");
            System.out.println("3. Finn arrangementer på dato");
            System.out.println("4. Finn arrangementer innen tidsintervall");
            System.out.println("5. List alle arrangementer sortert etter sted");
            System.out.println("6. List alle arrangementer sortert etter type");
            System.out.println("7. List alle arrangementer sortert etter tidspunkt");
            System.out.println("0. Avslutt");
            System.out.print("Velg et alternativ: ");
            int valg = scanner.nextInt();
            scanner.nextLine(); // konsumere newline

            switch (valg) {
                case 1:
                    registrerArrangement();
                    break;
                case 2:
                    finnArrangementerPaSted();
                    break;
                case 3:
                    finnArrangementerPaDato();
                    break;
                case 4:
                    finnArrangementerITidsintervall();
                    break;
                case 5:
                    listArrangementer(register.sorterEtterSted());
                    break;
                case 6:
                    listArrangementer(register.sorterEtterType());
                    break;
                case 7:
                    listArrangementer(register.sorterEtterTidspunkt());
                    break;
                case 0:
                    System.out.println("Avslutter programmet.");
                    return;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        }
    }

    private static void registrerArrangement() {
        System.out.print("Nummer: ");
        int nummer = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Navn: ");
        String navn = scanner.nextLine();
        System.out.print("Sted: ");
        String sted = scanner.nextLine();
        System.out.print("Arrangør: ");
        String arrangor = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Tidspunkt (yyyyMMddHHmm): ");
        long tidspunkt = scanner.nextLong();
        Arrangement arrangement = new Arrangement(nummer, navn, sted, arrangor, type, tidspunkt);
        register.registrerArrangement(arrangement);
        System.out.println("Arrangement registrert.");
    }

    private static void finnArrangementerPaSted() {
        System.out.print("Sted: ");
        String sted = scanner.nextLine();
        listArrangementer(register.finnArrangementerPaSted(sted));
    }

    private static void finnArrangementerPaDato() {
        System.out.print("Dato (yyyyMMdd): ");
        long dato = scanner.nextLong();
        listArrangementer(register.finnArrangementerPaDato(dato));
    }

    private static void finnArrangementerITidsintervall() {
        System.out.print("Starttidspunkt (yyyyMMddHHmm): ");
        long startTid = scanner.nextLong();
        System.out.print("Sluttidspunkt (yyyyMMddHHmm): ");
        long sluttTid = scanner.nextLong();
        listArrangementer(register.finnArrangementerITidsintervall(startTid, sluttTid));
    }

    private static void listArrangementer(List<Arrangement> arrangementer) {
        if (arrangementer.isEmpty()) {
            System.out.println("Ingen arrangementer funnet.");
        } else {
            arrangementer.forEach(System.out::println);
        }
    }
}