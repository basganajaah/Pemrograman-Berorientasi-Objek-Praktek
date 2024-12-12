import java.util.HashMap;
import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        HashMap<String, Double> productCatalog = new HashMap<>();
        productCatalog.put("Nasi Goreng", 15000.0);
        productCatalog.put("Nasi Kuning", 8000.0);
        productCatalog.put("Nasi Uduk", 7000.0);
        productCatalog.put("Nasi Lengko", 10000.0);

        System.out.println("Katalog Produk: ");
        for (var entry : productCatalog.entrySet()) {
            System.out.println(entry.getKey() + ": Rp " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama produk yang ingin dicari: ");
        String productName = scanner.nextLine();

        if (productCatalog.containsKey(productName)) {
            System.out.println("Harga " + productName + ": " + productCatalog.get(productName));
        } else {
            System.out.println(productName + " tidak ditemukan");
        }

        scanner.close();
    }
}