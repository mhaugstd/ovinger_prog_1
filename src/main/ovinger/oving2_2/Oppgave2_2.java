package oving2_2;

public class Oppgave2_2 {
    public static void main(String[] args) {
        // Prisen og mengden for merke A
        double prisA = 35.90;
        int gramA = 450;

        // Prisen og mengden for merke B
        double prisB = 35.90;
        int gramB = 450;

        // Beregne pris per gram for begge merkene
        double prisPerGramA = prisA / gramA;
        double prisPerGramB = prisB / gramB;

        // Sammenligne prisene og skrive ut hvilket merke som er billigst
        if (prisPerGramA < prisPerGramB) {
            System.out.println("Merke A er billigst.");
        } else if (prisPerGramA > prisPerGramB) {
            System.out.println("Merke B er billigst.");
        } else {
            System.out.println("Begge merkene har samme pris per gram.");
        }
    }
}