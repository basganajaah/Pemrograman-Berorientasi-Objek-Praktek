public class Melee extends Weapon implements WeaponInformation, MeleeAction {

    public Melee(String name){
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println(getName());
        System.out.println();
    }

    @Override
    public void stabbing() {
        System.out.println("Menusuk menggunakan " + getName());
    }
}