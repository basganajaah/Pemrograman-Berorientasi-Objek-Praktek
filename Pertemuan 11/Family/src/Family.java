import java.util.ArrayList;
import java.util.Comparator;

public class Family {
    private final ArrayList<Uncle> uncles = new ArrayList<>();
    private final ArrayList<Niece> nieces = new ArrayList<>();

    public ArrayList<Niece> getNieces() {
        return new ArrayList<>(nieces);
    }

    public ArrayList<Uncle> getUncles() {
        return new ArrayList<>(uncles);
    }

    public void addNiece(String name, int day, int month) {
        if (findNiece(name) != null) return;
        nieces.add(new Niece(name, day, month));
    }

    public void addUncle(String name) {
        if (findUncle(name) != null) return;
        uncles.add(new Uncle(name));
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equalsIgnoreCase(name)) return niece;
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equalsIgnoreCase(name)) return uncle;
        }
        return null;
    }

    public void listNieces() {
        nieces.sort(Comparator.comparing(Niece::getBirthday));
        for (Niece niece : nieces) {
            System.out.println(niece);
        }
    }

    public void listUncles() {
        uncles.sort(Comparator.comparing(Uncle::getName));
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }
}
