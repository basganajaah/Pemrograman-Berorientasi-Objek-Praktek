public class ProxyPatternMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("example.jpg");
        System.out.println("Gambar belum diload.");
        image.display(); // menampilkan gambar (dengan load)
        image.display(); // menampilkan gambar lagi (tanpa load)
    }
}