package oving7_1;

public class TekstBehandling {
    private final String tekst;

    // Konstruktør
    public TekstBehandling(String tekst) {
        this.tekst = tekst;
    }

    // antall ord i teksten
    public int finnAntallOrd() {
        String[] ord = tekst.split("\\s+");
        return ord.length;
    }

    //gjennomsnittlig ordlengde
    public double gjennomsnittligOrdlengde() {
        String[] ord = tekst.split("\\s+");
        int totalLengde = 0;
        for (String ordet : ord) {
            totalLengde += ordet.replaceAll("[^\\p{L}]", "").length(); // Fjerner skilletegn
        }
        return ord.length > 0 ? (double) totalLengde / ord.length : 0;
    }

    //gjennomsnittlig antall or
    public double gjennomsnittligOrdPerPeriode() {
        String[] perioder = tekst.split("[.!?]");
        int totalOrd = finnAntallOrd();
        return perioder.length > 0 ? (double) totalOrd / perioder.length : 0;
    }

    //skifte ut et ord
    public String skiftUtOrd(String gammeltOrd, String nyttOrd) {
        return tekst.replace(gammeltOrd, nyttOrd);
    }

    // hente ut teksten
    public String hentTekst() {
        return tekst;
    }

    // hente ut teksten i store bokstaver
    public String hentTekstMedStoreBokstaver() {
        return tekst.toUpperCase();
    }
}