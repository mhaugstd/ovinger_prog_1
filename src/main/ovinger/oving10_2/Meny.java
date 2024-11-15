package oving10_2;

import java.util.ArrayList;
import java.util.List;

public class Meny {
    private List<Rett> retter;

    public Meny() {
        this.retter = new ArrayList<>();
    }

    public void leggTilRett(Rett rett) {
        retter.add(rett);
    }

    public double beregnTotalpris() {
        return retter.stream().mapToDouble(Rett::getPris).sum();
    }

    public List<Rett> getRetter() {
        return new ArrayList<>(retter);
    }

    @Override
    public String toString() {
        return "Meny{" +
                "retter=" + retter +
                ", totalpris=" + beregnTotalpris() +
                '}';
    }
}