package oving11_1;

/**
 * Representerer en eiendom i en kommune.
 */
public class Eiendom {
    private int kommunenr;
    private String kommunenavn;
    private int gnr; // Gårdsnummer
    private int bnr; // Bruksnummer
    private String bruksnavn;
    private double areal;
    private String eier;

    /**
     * Konstruktør for å opprette en ny eiendom.
     * @param kommunenr Kommunenummeret.
     * @param kommunenavn Navnet på kommunen.
     * @param gnr Gårdsnummeret.
     * @param bnr Bruksnummeret.
     * @param bruksnavn Navnet på eiendommen (kan være null).
     * @param areal Arealet til eiendommen i kvadratmeter.
     * @param eier Navnet på eieren.
     */
    public Eiendom(int kommunenr, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eier) {
        this.kommunenr = kommunenr;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eier = eier;
    }

    public int getKommunenr() {
        return kommunenr;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public double getAreal() {
        return areal;
    }

    public String getEiendomsID(){
        return "EiendomsID:" + kommunenr + "-" + gnr + "/" + bnr;
    }

    /**
     * Returnerer eiendommens informasjon i et formatert format.
     * @return En streng som beskriver eiendommen.
     */
    @Override
    public String toString() {
        return getEiendomsID() +
                (bruksnavn != null && !bruksnavn.isEmpty() ? " " + bruksnavn : "") +
                ", areal: " + areal + " m2, eier: " + eier;
    }
}