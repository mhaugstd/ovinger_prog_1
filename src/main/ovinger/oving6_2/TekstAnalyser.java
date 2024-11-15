package oving6_2;

import java.util.Arrays;

public class TekstAnalyser {
    public int[] frekvensTabell;

    public TekstAnalyser(String input) {
        frekvensTabell = new int[31];
        analyserTekst(input);
    }

    private void analyserTekst(String tekst) {
        for (char c : tekst.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toUpperCase(c) - 'A';
                if (index >= 0 && index < 30) {
                    frekvensTabell[index]++;
                }
            } else {
                frekvensTabell[30]++;
            }
        }
    }

    public int totaltAntallBokstaver() {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum += frekvensTabell[i];
        }
        return sum;
    }

    public double prosentIkkeBokstaver() {
        int total = totaltAntallBokstaver() + frekvensTabell[30];
        return total > 0 ? (frekvensTabell[30] / (double) total) * 100 : 0;
    }

    public int antallForekomsterAvBokstav(char bokstav) {
        if (Character.isLetter(bokstav)) {
            int index = Character.toUpperCase(bokstav) - 'A';
            if (index >= 0 && index < 30) {
                return frekvensTabell[index];
            }
        }
        return 0;
    }

    public String mestBrukteBokstav() {
        int maxIndex = 0;
        int maxVerdi = 0;

        for (int i = 0; i < 30; i++) {
            if (frekvensTabell[i] > maxVerdi) {
                maxIndex = i;
                maxVerdi = frekvensTabell[i];
            }
        }

        char mestBrukt = (char) ('A' + maxIndex);
        double prosent = (maxVerdi / (double) totaltAntallBokstaver()) * 100;

        return "Mest brukte bokstav: '" + mestBrukt + "' med " + prosent + "% av teksten.";
    }
}