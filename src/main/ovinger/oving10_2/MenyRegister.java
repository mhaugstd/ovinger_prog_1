package oving10_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenyRegister {
    private List<Rett> retter;
    private List<Meny> menyer;

    public MenyRegister() {
        this.retter = new ArrayList<>();
        this.menyer = new ArrayList<>();
    }

    public void registrerRett(Rett rett) {
        retter.add(rett);
    }

    public Rett finnRett(String navn) {
        return retter.stream()
                .filter(rett -> rett.getNavn().equalsIgnoreCase(navn))
                .findFirst()
                .orElse(null);
    }

    public List<Rett> finnRetterAvType(String type) {
        return retter.stream()
                .filter(rett -> rett.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    public void registrerMeny(Meny meny) {
        menyer.add(meny);
    }

    public List<Meny> finnMenyerInnenforIntervall(double minPris, double maxPris) {
        return menyer.stream()
                .filter(meny -> {
                    double totalpris = meny.beregnTotalpris();
                    return totalpris >= minPris && totalpris <= maxPris;
                })
                .collect(Collectors.toList());
    }

    public List<Rett> getAlleRetter() {
        return new ArrayList<>(retter);
    }

    public List<Meny> getAlleMenyer() {
        return new ArrayList<>(menyer);
    }
}