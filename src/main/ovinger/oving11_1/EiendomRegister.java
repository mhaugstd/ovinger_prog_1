package oving11_1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Et register som holder oversikt over alle eiendommer i en kommune.
 */
public class EiendomRegister {
    private List<Eiendom> eiendommer;

    /**
     * Konstruktør som oppretter et nytt eiendomsregister.
     */
    public EiendomRegister() {
        eiendommer = new ArrayList<>();
    }

    /**
     * Registrerer en ny eiendom i registeret.
     * @param eiendom Eiendommen som skal legges til.
     */
    public void registrerEiendom(Eiendom eiendom) {
        eiendommer.add(eiendom);
    }

    /**
     * Henter alle registrerte eiendommer i registeret.
     * @return En liste over alle eiendommer.
     */
    public List<Eiendom> getAlleEiendommer() {
        return new ArrayList<>(eiendommer);
    }

    /**
     * Finner en eiendom basert på kommunenummer, gårdsnummer og bruksnummer.
     * @param kommunenr Kommunenummeret til eiendommen.
     * @param gnr Gårdsnummeret til eiendommen.
     * @param bnr Bruksnummeret til eiendommen.
     * @return Den funne eiendommen, eller null hvis ingen eiendom ble funnet.
     */
    public Eiendom finnEiendom(int kommunenr, int gnr, int bnr) {
        return eiendommer.stream()
                .filter(e -> e.getKommunenr() == kommunenr && e.getGnr() == gnr && e.getBnr() == bnr)
                .findFirst()
                .orElse(null);
    }

    /**
     * Beregner gjennomsnittlig areal av alle eiendommer i registeret.
     * @return Gjennomsnittlig areal, eller 0 hvis ingen eiendommer er registrert.
     */
    public double beregnGjennomsnittligAreal() {
        OptionalDouble gjennomsnitt = eiendommer.stream().mapToDouble(Eiendom::getAreal).average();
        return gjennomsnitt.isPresent() ? gjennomsnitt.getAsDouble() : 0;
    }
}