public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Instance telah dibuat!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Halo, pengguna!");
    }
}
