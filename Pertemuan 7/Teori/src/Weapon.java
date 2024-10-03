public abstract class Weapon {
    private String name;
    private int capacity;
    private int magazine;
    private double fireRate;
    private int price;

    public Weapon(String name) {
        this.name = name;
    }

    public Weapon(String name, int reserves, int magazine, double fireRate, int price) {
        this.name = name;
        this.capacity = reserves;
        this.magazine = magazine;
        this.fireRate = fireRate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFireRate() {
        return fireRate;
    }

    public void setFireRate(double fireRate) {
        this.fireRate = fireRate;
    }

    public int getMagazine() {
        return magazine;
    }

    public void setMagazine(int magazine) {
        this.magazine = magazine;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}