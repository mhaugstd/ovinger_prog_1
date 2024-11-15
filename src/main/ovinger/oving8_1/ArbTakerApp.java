package oving8_1;


import java.util.Scanner;

public class ArbTakerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Opprett Person og ArbTaker-objekter
        Person person = new Person("Berit", "Johnsen", 1985);
        ArbTaker arbTaker = new ArbTaker(person, 1234, 2010, 45000, 30);

        boolean fortsett = true;

        while (fortsett) {
            System.out.println("\n--- Meny ---");
            System.out.println("1. Vis arbeidstakerinfo");
            System.out.println("2. Beregn skattetrekk per måned");
            System.out.println("3. Beregn brutto årslønn");
            System.out.println("4. Beregn årlig skattetrekk");
            System.out.println("5. Endre månedslønn");
            System.out.println("6. Endre skatteprosent");
            System.out.println("7. Avslutt");
            System.out.print("Velg et alternativ: ");
            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    System.out.println(arbTaker);
                    break;
                case 2:
                    System.out.println("Skattetrekk per måned: " + arbTaker.skattPerManed() + " kr");
                    break;
                case 3:
                    System.out.println("Brutto årslønn: " + arbTaker.bruttoArslonn() + " kr");
                    break;
                case 4:
                    System.out.println("Årlig skattetrekk: " + arbTaker.skattetrekkPerAr() + " kr");
                    break;
                case 5:
                    System.out.print("Ny månedslønn: ");
                    double nyLonn = scanner.nextDouble();
                    arbTaker.setManedslonn(nyLonn);
                    break;
                case 6:
                    System.out.print("Ny skatteprosent: ");
                    double nySkatt = scanner.nextDouble();
                    arbTaker.setSkatteprosent(nySkatt);
                    break;
                case 7:
                    fortsett = false;
                    break;
                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
            }
        }

        scanner.close();
    }
}