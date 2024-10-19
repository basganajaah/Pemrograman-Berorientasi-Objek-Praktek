import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many strings do you want to sort?");
        int size = scan.nextInt();
        scan.nextLine();

        String[] strings = new String[size];

        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            strings[i] = scan.nextLine();
        }

        Sorting.selectionSort(strings);

        System.out.println("Your strings in sorted order:");
        for (int i = 0; i < size; i++) {
            System.out.println(strings[i]);
        }
    }
}
