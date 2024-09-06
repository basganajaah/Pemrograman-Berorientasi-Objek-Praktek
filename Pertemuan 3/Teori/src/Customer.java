import java.util.ArrayList;
import java.util.Scanner;

record Customer(String customerName) {

    public void purchaseFood(ArrayList<FoodItems> menu, Scanner scanner) {
        System.out.println("Selamat datang, " + customerName + "!");
        displayMenu(menu);

        System.out.print("Pilih menu makanan yang diinginkan: ");
        int foodChoice = scanner.nextInt();


        if (foodChoice > 0 && foodChoice <= menu.size()) {
            FoodItems chosenFood = menu.get(foodChoice - 1);
            System.out.print("Masukkan jumlah: ");
            int quantity = scanner.nextInt();

            if (chosenFood.isInStock(quantity)) {
                chosenFood.purchase(quantity);
            } else {
                System.out.println("Maaf, stok makanan pilihanmu habis:( " + chosenFood.getFoodName());
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public void displayMenu(ArrayList<FoodItems> menu) {
        for (int i = 0; i < menu.size(); i++) {
            FoodItems food = menu.get(i);
            System.out.println((i + 1) + ". " + food.getFoodName() + " - Rp. " + food.getPrice() + " (Stok: " + food.getStock() + ")");
        }
    }
}