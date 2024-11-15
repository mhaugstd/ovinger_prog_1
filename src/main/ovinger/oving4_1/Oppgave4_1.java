package oving4_1;

import java.util.Scanner;

public class Oppgave4_1 {

    // Valutaklassen for å håndtere konverteringer
    static class Valuta {
        private double kurs;  // Valutakursen i forhold til norske kroner

        // Konstruktør for å sette kursen
        public Valuta(double kurs) {
            this.kurs = kurs;
        }

        // Metode for å konvertere fra valuta til NOK
        public double tilNOK(double belop) {
            return belop * kurs;
        }

        // Metode for å konvertere fra NOK til valuta
        public double fraNOK(double belopNOK) {
            return belopNOK / kurs;
        }
    }

    public static void main(String[] args) {
        // Opprett tre valutaobjekter med aktuelle kurser mot NOK
        Valuta dollar = new Valuta(10.5);  // 1 dollar = 10.5 NOK
        Valuta euro = new Valuta(12.0);    // 1 euro = 12 NOK
        Valuta sek = new Valuta(1.1);      // 1 SEK = 1.1 NOK

        // Bruker Scanner for input fra brukeren
        Scanner input = new Scanner(System.in);

        // Variabel for å lagre brukervalg
        int valg = 0;

        // Hovedmeny
        while (valg != 5) { // 5 avslutter programmet
            // Vis menyen
            System.out.println("Velg valuta:");
            System.out.println("1: Dollar til NOK");
            System.out.println("2: Euro til NOK");
            System.out.println("3: Svenske kroner til NOK");
            System.out.println("4: Fra NOK til annen valuta");
            System.out.println("5: Avslutt");

            // Hent brukerens valg
            valg = input.nextInt();

            switch (valg) {
                case 1:  // Dollar til NOK
                    System.out.print("Skriv inn beløp i dollar: ");
                    double belopDollar = input.nextDouble();
                    System.out.println(belopDollar + " dollar er " + dollar.tilNOK(belopDollar) + " NOK.");
                    break;
                case 2:  // Euro til NOK
                    System.out.print("Skriv inn beløp i euro: ");
                    double belopEuro = input.nextDouble();
                    System.out.println(belopEuro + " euro er " + euro.tilNOK(belopEuro) + " NOK.");
                    break;
                case 3:  // SEK til NOK
                    System.out.print("Skriv inn beløp i svenske kroner: ");
                    double belopSEK = input.nextDouble();
                    System.out.println(belopSEK + " SEK er " + sek.tilNOK(belopSEK) + " NOK.");
                    break;
                case 4:  // NOK til annen valuta
                    System.out.println("Velg valuta du vil konvertere til:");
                    System.out.println("1: Dollar");
                    System.out.println("2: Euro");
                    System.out.println("3: Svenske kroner");
                    int valutaValg = input.nextInt();

                    System.out.print("Skriv inn beløp i NOK: ");
                    double belopNOK = input.nextDouble();

                    if (valutaValg == 1) {
                        System.out.println(belopNOK + " NOK er " + dollar.fraNOK(belopNOK) + " dollar.");
                    } else if (valutaValg == 2) {
                        System.out.println(belopNOK + " NOK er " + euro.fraNOK(belopNOK) + " euro.");
                    } else if (valutaValg == 3) {
                        System.out.println(belopNOK + " NOK er " + sek.fraNOK(belopNOK) + " SEK.");
                    } else {
                        System.out.println("Ugyldig valuta valg.");
                    }
                    break;
                case 5:  // Avslutt
                    System.out.println("Avslutter programmet.");
                    break;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
                    break;
            }
        }

        // Lukk Scanner
        input.close();
    }
}