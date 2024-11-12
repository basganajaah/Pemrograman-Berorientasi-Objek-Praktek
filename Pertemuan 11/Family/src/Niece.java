import java.util.HashMap;
import java.time.LocalDate;

public class Niece {
    private final String name;
    private final LocalDate birthday;
    private final HashMap<Uncle, String> receivedPresents = new HashMap<>();
    private Family family;

    Niece(String name, int day, int month) {
        this.name = name;
        this.birthday = LocalDate.of(LocalDate.now().getYear(), month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public boolean hasPresentFrom(Uncle uncle) {
        return receivedPresents.containsKey(uncle);
    }

    public void addPresent(Uncle uncle, String description) {
        receivedPresents.put(uncle, description);
    }

    public int clearPresents() {
        int count = receivedPresents.size();
        receivedPresents.clear();
        return count;
    }

    public void listPresents() {
        System.out.println();
        System.out.println("Hadiah untuk " + name + ":");
        for (Uncle uncle : receivedPresents.keySet()) {
            System.out.println("Dari " + uncle.getName() + ": " + receivedPresents.get(uncle));
        }
        for (Uncle uncle : family.getUncles()) {
            if (!receivedPresents.containsKey(uncle)) {
                System.out.println("Tidak ada hadiah dari " + uncle.getName());
            }
        }
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return name + " - Ulang Tahun: " + birthday.getDayOfMonth() + "/" + birthday.getMonthValue();
    }
}
