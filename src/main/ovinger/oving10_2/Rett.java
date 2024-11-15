package oving10_2;

public class Rett {
    private String navn;
    private String type; // for eksempel "forrett", "hovedrett", "dessert"
    private double pris;
    private String oppskrift;

    public Rett(String navn, String type, double pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public double getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    @Override
    public String toString() {
        return "Rett{" +
                "navn='" + navn + '\'' +
                ", type='" + type + '\'' +
                ", pris=" + pris +
                ", oppskrift='" + oppskrift + '\'' +
                '}';
    }
}