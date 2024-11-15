package oving9_1;

import java.util.ArrayList;

public class Oppgaveoversikt {
    private final ArrayList<Student> studenter; // Liste over studenter

    // Konstruktør
    public Oppgaveoversikt() {
        this.studenter = new ArrayList<>();
    }

    // Finn antall studenter registrert
    public int finnAntStudenter() {
        return studenter.size();
    }

    // Finn antall oppgaver for en bestemt student
    public int finnAntOppgForStudent(String navn) {
        for (Student student : studenter) {
            if (student.getNavn().equalsIgnoreCase(navn)) {
                return student.getAntOppg();
            }
        }
        throw new IllegalArgumentException("Student ikke funnet: " + navn);
    }

    // Registrer en ny student
    public boolean registrerStudent(String navn) {
        for (Student student : studenter) {
            if (student.getNavn().equalsIgnoreCase(navn)) {
                return false; // Student med dette navnet finnes allerede
            }
        }
        studenter.add(new Student(navn));
        return true;
    }

    // Øk antall oppgaver for en bestemt student
    public void okAntOppgForStudent(String navn, int okning) {
        for (Student student : studenter) {
            if (student.getNavn().equalsIgnoreCase(navn)) {
                student.okAntOppg(okning);
                return;
            }
        }
        throw new IllegalArgumentException("Student ikke funnet: " + navn);
    }

    // ToString-metode
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Oppgaveoversikt:\n");
        for (Student student : studenter) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}
