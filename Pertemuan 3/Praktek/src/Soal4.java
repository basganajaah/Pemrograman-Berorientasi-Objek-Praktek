import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaItem = 50000;
        int gajiPokok = 500000;
        double gajiAgent = gajiPokok;

        System.out.print("Masukkan jumlah penjualan item: ");
        int totalPenjualan = scanner.nextInt();

        int totalHarga = totalPenjualan * hargaItem;

        if (totalPenjualan > 80) {
            gajiAgent += totalHarga * 0.35;
        } else if (totalPenjualan >= 40) {
            gajiAgent += totalHarga * 0.25;
        } else if (totalPenjualan >= 15) {
            gajiAgent += totalHarga * 0.10;
        } else {
            int minus = 15 - totalPenjualan;
            double denda = minus * hargaItem * 0.15;
            gajiAgent -= denda;
        }
        System.out.println("Gaji Agent = Rp " + (int) gajiAgent);
    }
}