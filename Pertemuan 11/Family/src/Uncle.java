import java.util.ArrayList;
import java.util.HashMap;

public class Uncle {
    private final String name;
    private final HashMap<Niece, String> presents = new HashMap<>();
    private Family family;

    Uncle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPresent(Niece recipient, String description) {
        if (presents.containsValue(description) || recipient.hasPresentFrom(this)) {
            return;
        }
        presents.put(recipient, description);
        recipient.addPresent(this, description);
    }

    public void listPresents() {
        System.out.println();
        System.out.println("Hadiah dari Paman " + name + ":");
        for (Niece niece : presents.keySet()) {
            System.out.println("Untuk " + niece.getName() + ": " + presents.get(niece));
        }
        for (Niece niece : recipientWithoutPresent()) {
            System.out.println("Tidak ada hadiah untuk " + niece.getName());
        }
    }

    private ArrayList<Niece> recipientWithoutPresent() {
        ArrayList<Niece> withoutPresent = new ArrayList<>();
        for (Niece niece : family.getNieces()) {
            if (!presents.containsKey(niece)) {
                withoutPresent.add(niece);
            }
        }
        return withoutPresent;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
