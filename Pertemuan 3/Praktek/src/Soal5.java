import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mobil1 = scanner.next();
        String mobil2 = scanner.next();
        String mobil3 = scanner.next();
        String mobil4 = scanner.next();

        String string = mobil1 + mobil2 + mobil3 + mobil4;

        long gabunganAngka = Long.parseLong(string);
        long hasilKurang = gabunganAngka - 999999;

        String isJalan = (hasilKurang % 5 == 0) ? "berhenti" : "jalan";
        System.out.println(isJalan);
    }
}
