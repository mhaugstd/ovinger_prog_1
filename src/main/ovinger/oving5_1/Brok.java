package oving5_1;

public class Brok {
    private int teller;
    private int nevner;

    public Brok(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikke være 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public Brok(int teller) {
        this(teller, 1);
    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public Brok summer(Brok annen) {
        int nyTeller = this.teller * annen.nevner + annen.teller * this.nevner;
        int nyNevner = this.nevner * annen.nevner;
        return new Brok(nyTeller, nyNevner);
    }

    public Brok subtraher(Brok annen) {
        int nyTeller = this.teller * annen.nevner - annen.teller * this.nevner;
        int nyNevner = this.nevner * annen.nevner;
        return new Brok(nyTeller, nyNevner);
    }

    public Brok multipliser(Brok annen) {
        int nyTeller = this.teller * annen.teller;
        int nyNevner = this.nevner * annen.nevner;
        return new Brok(nyTeller, nyNevner);
    }

    public Brok divider(Brok annen) {
        if (annen.teller == 0) {
            throw new IllegalArgumentException("Kan ikke dele på 0");
        }
        int nyTeller = this.teller * annen.nevner;
        int nyNevner = this.nevner * annen.teller;
        return new Brok(nyTeller, nyNevner);
    }

    public Brok forkort() {
        int gcd = BrokUtils.finnGCD(teller, nevner);
        return new Brok(teller / gcd, nevner / gcd);
    }

    @Override
    public String toString() {
        return teller + "/" + nevner;
    }
}