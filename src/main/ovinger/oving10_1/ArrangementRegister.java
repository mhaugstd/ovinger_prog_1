package oving10_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangementRegister {
    private List<Arrangement> arrangementer;

    public ArrangementRegister() {
        this.arrangementer = new ArrayList<>();
    }

    public void registrerArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }

    public List<Arrangement> finnArrangementerPaSted(String sted) {
        return arrangementer.stream()
                .filter(a -> a.getSted().equalsIgnoreCase(sted))
                .collect(Collectors.toList());
    }

    public List<Arrangement> finnArrangementerPaDato(long dato) {
        return arrangementer.stream()
                .filter(a -> a.getTidspunkt() / 10000 == dato)
                .collect(Collectors.toList());
    }

    public List<Arrangement> finnArrangementerITidsintervall(long startTid, long sluttTid) {
        return arrangementer.stream()
                .filter(a -> a.getTidspunkt() >= startTid && a.getTidspunkt() <= sluttTid)
                .sorted((a1, a2) -> Long.compare(a1.getTidspunkt(), a2.getTidspunkt()))
                .collect(Collectors.toList());
    }

    public List<Arrangement> sorterEtterSted() {
        return arrangementer.stream()
                .sorted((a1, a2) -> a1.getSted().compareToIgnoreCase(a2.getSted()))
                .collect(Collectors.toList());
    }

    public List<Arrangement> sorterEtterType() {
        return arrangementer.stream()
                .sorted((a1, a2) -> a1.getType().compareToIgnoreCase(a2.getType()))
                .collect(Collectors.toList());
    }

    public List<Arrangement> sorterEtterTidspunkt() {
        return arrangementer.stream()
                .sorted((a1, a2) -> Long.compare(a1.getTidspunkt(), a2.getTidspunkt()))
                .collect(Collectors.toList());
    }
}