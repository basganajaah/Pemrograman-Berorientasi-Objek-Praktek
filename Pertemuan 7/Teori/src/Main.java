public class Main {
    public static void main(String[] args) {
        Melee Knife = new Melee("Knife");
        Sidearms Frenzy = new Sidearms("Shorty", 33, 13, 10, 450);
        Sidearms Ghost = new Sidearms("Ghost", 36, 12, 6.75, 500);
        Sidearms Sheriff = new Sidearms("Sheriff", 24, 6, 4, 800);
        Primary Spectre = new Primary("Spectre", 90, 30, 13.33, 1600, 1.15);
        Primary Vandal = new Primary("Vandal", 50, 25, 9.75, 2900, 1.25);
        Primary Phantom = new Primary("Phantom", 60, 30, 11, 2900, 1.25);
        Primary Odin = new Primary("Odin", 200, 100, 12, 3200, 1.25);
        Primary Operator = new Primary("Operator", 10, 5, 0.6, 4700, 5);

        // Implementasi dari interface GunInformation
        System.out.println("MELEE WEAPON");
        Knife.displayInfo();
        System.out.println("SIDEARMS WEAPON");
        Frenzy.displayInfo();
        Ghost.displayInfo();
        Sheriff.displayInfo();
        System.out.println("PRIMARY WEAPON");
        Spectre.displayInfo();
        Vandal.displayInfo();
        Phantom.displayInfo();
        Odin.displayInfo();
        Operator.displayInfo();
        // Implementasi dari interface GunAction
        Knife.stabbing();
        Frenzy.shootGun();
        Ghost.shootGun();
        Operator.shootGun();
        Vandal.reloadGun();
        Phantom.reloadGun();
        Operator.reloadGun();
    }
}