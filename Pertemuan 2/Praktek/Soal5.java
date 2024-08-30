import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan kata ke-1: ");
            String string1 = scanner.next();

            System.out.print("Masukkan kata ke-2: ");
            String string2 = scanner.next();

            int totalLength = string1.length() + string2.length();
            int comparisonResult = string1.compareToIgnoreCase(string2);
            String isLexicograph = (comparisonResult < 0) ? "No" : (comparisonResult > 0) ? "Yes" : "Equal";

            System.out.println(totalLength);
            System.out.println(isLexicograph);
            System.out.print(string1.substring(0, 1).toUpperCase() + string1.substring(1));
            System.out.print(" " + string2.substring(0, 1).toUpperCase() + string2.substring(1));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
