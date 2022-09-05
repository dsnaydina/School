import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class School {

    private List<Klasa> klasas;

    public School(List<Klasa> klasas) {
        this.klasas = klasas;

    }

    public void addKlasa(Klasa klasa) {
        klasas.add(klasa);
    }

    public void removeKlasa(Klasa klasa) {
        klasas.remove(klasa);
    }

    public List<Klasa> getKlasas() {
        return klasas;
    }
}

