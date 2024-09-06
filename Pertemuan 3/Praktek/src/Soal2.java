import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = 3;

        String[] strings = new String[loop];
        int[] numbers = new int[loop];

        for (int i = 0; i < loop; i++) {
            strings[i] = scanner.next();
            numbers[i] = scanner.nextInt();
        }

        String[] newStrings = new String[loop];

        // Kondisi ketika string melebihi 10 alphabetic characters
        for (int i = 0; i < loop; i++) {
            if (strings[i].length() > 10) {
                newStrings[i] = strings[i].substring(0, 10);
            } else {
                newStrings[i] = strings[i];
            }
        }

        int len = strings[0].length();
        System.out.println(len);

        System.out.println("================================");
        for (int i = 0; i < loop; i++) {
            System.out.printf("%-15s%03d\n", newStrings[i], numbers[i] < 0 ? 0 : Math.min(numbers[i], 999));
        }
        System.out.println("================================");

        scanner.close();
    }
}
