public class Primary extends Weapon implements WeaponInformation, GunAction {
    protected double zoomScope;

    public Primary(String name, int capacity, int magazine, double fireRate, int price, double zoomScope) {
        super(name, capacity, magazine, fireRate, price);
        this.zoomScope = zoomScope;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%s\n" +
                "   Price       : %d\n" +
                "   Ammo        : %d/%d\n" +
                "   Fire Rate   : %.2f round/detik\n" +
                "   Zoom        : %.2fx\n",
                getName(), getPrice(), getMagazine(), getCapacity(), getFireRate(), zoomScope);
        System.out.println();
    }

    @Override
    public void shootGun() {
        System.out.println("Menembak menggunakan " + getName());
    }

    @Override
    public void reloadGun() {
        System.out.println("Reloading untuk " + getName());
    }
}



