package oving9_1;

public class Student {
    private final String navn; // Studentens navn (unikt)
    private int antOppg; // Antall godkjente oppgaver

    // Konstruktør
    public Student(String navn) {
        this.navn = navn;
        this.antOppg = 0; // Starter med 0 oppgaver godkjent
    }

    // Get-metoder
    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    // Øk antall godkjente oppgaver
    public void okAntOppg(int okning) {
        if (okning > 0) {
            antOppg += okning;
        } else {
            throw new IllegalArgumentException("Økning må være større enn 0");
        }
    }

    // ToString-metode
    @Override
    public String toString() {
        return "Student: " + navn + ", Godkjente oppgaver: " + antOppg;
    }
}