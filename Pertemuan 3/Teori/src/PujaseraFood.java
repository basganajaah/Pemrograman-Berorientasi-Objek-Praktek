import java.util.ArrayList;
import java.util.Scanner;

public class PujaseraFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FoodItems nasiKatsu = new FoodItems("Nasi Katsu", 10000, 10);
        nasiKatsu.setFoodName("Nasi Ayam Katsu");
        nasiKatsu.setPrice(15000);

        ArrayList<FoodItems> menu = new ArrayList<>();
        menu.add(new FoodItems("Nasi Goreng", 15000.0, 10));
        menu.add(new FoodItems("Bakso", 12000.0, 10));
        menu.add(new FoodItems("Mie Ayam", 13000.0, 10));
        menu.add(new FoodItems("Sate Ayam", 18000.0, 10));
        menu.add(new FoodItems("Sate Usus", 8000.0, 10));
        menu.add(nasiKatsu);

        int option = 0;

        while (option != 3) {
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Tambah Makanan pada Menu");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihanmu: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Masukkan nama Anda: ");
                    String customerName = scanner.nextLine();

                    Customer customer = new Customer(customerName);

                    customer.purchaseFood(menu, scanner);

                    System.out.print("Apakah kamu ingin membeli makanan lain? (yes/no): ");
                    String response = scanner.next();

                    while (response.equalsIgnoreCase("yes")) {
                        customer.purchaseFood(menu, scanner);
                        System.out.print("Apakah kamu ingin membeli makanan lain? (yes/no): ");
                        response = scanner.next();
                    }

                    System.out.println("Terima kasih atas pembelianmu, " + customer.customerName() + "! Selamat menikmati!");
                    break;
                case 2:
                    System.out.print("Masukkan nama makanan baru: ");
                    String newFoodName = scanner.nextLine();

                    System.out.print("Masukkan harga: ");
                    double newPrice = scanner.nextDouble();

                    System.out.print("Masukkan stok: ");
                    int newStock = scanner.nextInt();
                    scanner.nextLine();

                    menu.add(new FoodItems(newFoodName, newPrice, newStock));
                    System.out.println("Menu berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("Keluar dari PujaseraFood. Terima Kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}
