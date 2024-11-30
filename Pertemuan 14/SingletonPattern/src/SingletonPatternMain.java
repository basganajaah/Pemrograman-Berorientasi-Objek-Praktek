public class SingletonPatternMain {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        object1.showMessage();
        String result = (object1 == object2) ? "Ya, keduanya sama" : "Tidak, keduanya beda";
        System.out.println("Are object1 and object2 same? " + (object1 == object2) + "\n" + result);
    }
}
