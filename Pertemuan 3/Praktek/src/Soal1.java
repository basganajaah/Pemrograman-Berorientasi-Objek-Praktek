import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String string = scanner.nextLine();

        String[] tokens = string.split("[^A-Za-z]+");

        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);

        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }

        scanner.close();
    }
}
