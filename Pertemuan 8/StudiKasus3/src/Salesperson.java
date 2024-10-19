public class Salesperson implements Comparable<Salesperson> {
    private final String firstName;
    private final String lastName;
    private final int totalSales;

    public Salesperson (String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals (Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Salesperson otherSalesperson)) {
            return false;
        }

        return lastName.equals(otherSalesperson.getLastName()) &&
                firstName.equals(otherSalesperson.getFirstName());
    }

    public int compareTo(Salesperson other) {
        if (this.totalSales < other.totalSales) {
            return -1;
        } else if (this.totalSales > other.totalSales) {
            return 1;
        } else {
            return this.lastName.compareTo(other.lastName);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
