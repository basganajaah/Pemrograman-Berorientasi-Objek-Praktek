import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penjumlahan (+)");
        System.out.println("Pengurangan (-)");
        System.out.println("Perkalian (*)");
        System.out.println("Pembagian (/)");
        System.out.println("Hasil Bagi / Modulus (%)");
        System.out.println("Masukkan operasi matematika (1-1000): ");

        int number1 = scanner.nextInt();
        String operator = scanner.next();
        int number2 = scanner.nextInt();
        int hasil = 0;

        if (number1 >= 1 && number1 <= 1000) {
            if (number2 >= 1 && number2 <= 1000) {
                switch (operator) {
                    case "+":
                        hasil = number1 + number2;
                        break;
                    case "-":
                        hasil = number1 - number2;
                        break;
                    case "*":
                        hasil = number1 * number2;
                        break;
                    case "/":
                        hasil = number1 / number2;
                        break;
                    case "%":
                        hasil = number1 % number2;
                        break;
                    default:
                        System.out.println("Operator tidak valid.");
                }
            }
            System.out.println(hasil);
        } else {
            System.out.println("Hasil tidak ada karena angka melebihi batas");
        }
        scanner.close();
    }
}
