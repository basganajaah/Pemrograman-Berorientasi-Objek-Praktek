import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        if (isValid(A) && isValid(B)) {
            BigInteger numberA = new BigInteger(A);
            BigInteger numberB = new BigInteger(B);

            BigInteger hasilTambah = numberA.add(numberB);

            BigInteger hasilKali = numberA.multiply(numberB);

            System.out.println(hasilTambah);
            System.out.println(hasilKali);
        } else {
            System.out.println("Invalid. Masukkan angka non-negatif. Maksimal 200 digits");
        }

        scanner.close();
    }

    private static boolean isValid(String input) {
        return input.matches("\\d{1,200}") && new BigInteger(input).compareTo(BigInteger.ZERO) >= 0;
    }
}
