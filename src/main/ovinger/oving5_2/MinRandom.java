package oving5_2;

import java.util.Random;

public class MinRandom {
    private Random random;

    // Konstruktør
    public MinRandom() {
        random = new Random();
    }
    //heltall med minimim og maksimum
    public int nesteHeltall(int nedre, int ovre) {
        return random.nextInt(ovre - nedre) + nedre;
    }

    //desimaltaall med minimum og maksimum
    public double nesteDesimaltall(double nedre, double ovre) {
        return nedre + (ovre - nedre) * random.nextDouble();
    }

    public static void main(String[] args) {
        MinRandom mr = new MinRandom();

        // skriver ut
        System.out.println("Tilfeldige heltall i intervallet (10, 20):");
        for (int i = 0; i < 5; i++) {
            System.out.println(mr.nesteHeltall(10, 20));
        }

        // skriv ut
        System.out.println("Tilfeldige desimaltall i intervallet (1.5, 4.5):");
        for (int i = 0; i < 5; i++) {
            System.out.println(mr.nesteDesimaltall(1.5, 4.5));
        }
    }
}