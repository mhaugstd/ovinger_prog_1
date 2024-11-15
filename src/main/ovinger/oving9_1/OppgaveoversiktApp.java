package oving9_1;

public class OppgaveoversiktApp {
    public static void main(String[] args) {
        Oppgaveoversikt oversikt = new Oppgaveoversikt();

        // Registrer studenter
        oversikt.registrerStudent("Ola Nordmann");
        oversikt.registrerStudent("Kari Nordmann");

        // Øk antall oppgaver for en student
        oversikt.okAntOppgForStudent("Ola Nordmann", 5);
        oversikt.okAntOppgForStudent("Kari Nordmann", 3);

        // Vis antall oppgaver for en student
        System.out.println("Antall oppgaver for Ola: " + oversikt.finnAntOppgForStudent("Ola Nordmann"));
        System.out.println("Antall oppgaver for Kari: " + oversikt.finnAntOppgForStudent("Kari Nordmann"));

        // Skriv ut hele oversikten
        System.out.println(oversikt);

        // Registrer en ny student og legg til oppgaver
        oversikt.registrerStudent("Per Hansen");
        oversikt.okAntOppgForStudent("Per Hansen", 7);

        // Oppdatert oversikt
        System.out.println(oversikt);
    }
}