package oving8_1;

import java.util.GregorianCalendar;

public class ArbTaker {
    private final Person personalia; // Immuntable objekt
    private final int arbtakernr;
    private final int ansettelsesar;
    private double manedslonn;
    private double skatteprosent;

    // Konstruktør
    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesar, double manedslonn, double skatteprosent) {
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesar = ansettelsesar;
        this.manedslonn = manedslonn;
        this.skatteprosent = skatteprosent;
    }

    // Get-metoder
    public Person getPersonalia() {
        return personalia;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesar() {
        return ansettelsesar;
    }

    public double getManedslonn() {
        return manedslonn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    // Set-metoder for mutable attributter
    public void setManedslonn(double manedslonn) {
        this.manedslonn = manedslonn;
    }

    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    // Beregning av skattetrekk per måned
    public double skattPerManed() {
        return (manedslonn * (skatteprosent / 100));
    }

    // Beregning av bruttoårslønn
    public double bruttoArslonn() {
        return manedslonn * 12;
    }

    // Beregning av årlig skattetrekk
    public double skattetrekkPerAr() {
        double skatt = skattPerManed() * 10.5; // 10.5 måneder: 12 - halv skatt i desember og skattefri juni
        return skatt;
    }

    // Hent navn i formatet "Etternavn, Fornavn"
    public String navn() {
        return personalia.toString();
    }

    // Beregning av alder
    public int alder() {
        int ar = new GregorianCalendar().get(java.util.Calendar.YEAR);
        return ar - personalia.getFodselsar();
    }

    // Beregning av antall år ansatt
    public int antallArAnsatt() {
        int ar = new GregorianCalendar().get(java.util.Calendar.YEAR);
        return ar - ansettelsesar;
    }

    // Sjekk om personen har vært ansatt mer enn et gitt antall år
    public boolean harVartAnsattMerEnn(int ar) {
        return antallArAnsatt() > ar;
    }

    @Override
    public String toString() {
        return "Navn: " + navn() + ", Alder: " + alder() + ", Ansatt siden: " + ansettelsesar + ", Månedslønn: " + manedslonn + ", Skatteprosent: " + skatteprosent;
    }
}