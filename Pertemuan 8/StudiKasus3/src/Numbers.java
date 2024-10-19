import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers do you want to sort?");
        int size = scan.nextInt();

        Integer[] intList = new Integer[size];

        System.out.println("\nEnter the numbers");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }

        Sorting.selectionSort(intList);

        System.out.println("\nYour numbers in sorted order");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
    }
}
