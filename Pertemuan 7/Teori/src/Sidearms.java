public class Sidearms extends Weapon implements WeaponInformation, GunAction {
    public Sidearms(String name, int capacity, int magazine, double fireRate, int price) {
        super(name, capacity, magazine, fireRate, price);
    }

    @Override
    public void displayInfo() {
        System.out.printf("%s\n" +
                "   Price       : %d\n" +
                "   Ammo        : %d/%d\n" +
                "   Fire Rate   : %.2f round/detik\n",
                getName(), getPrice(), getMagazine(), getCapacity(), getFireRate());
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


