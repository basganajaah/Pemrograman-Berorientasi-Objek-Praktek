import java.util.Scanner;

public class WeeklySales {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salesperson[] salesStaff = new Salesperson[10];

        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
        salesStaff[2] = new Salesperson("James", "Jones", 3000);
        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
        salesStaff[9] = new Salesperson("Walt", "Smith", 3000);

//        for (int i = 0; i < salesStaff.length; i++) {
//            System.out.println("Masukkan detail dari salesperson " + (i + 1) + ":");
//
//            System.out.print("First name: ");
//            String firstName = scanner.nextLine();
//            System.out.print("Last name: ");
//            String lastName = scanner.nextLine();
//            System.out.print("Sales amount: ");
//            int salesAmount = scanner.nextInt();
//
//            salesStaff[i] = new Salesperson(firstName, lastName, salesAmount);
//            scanner.nextLine();
//        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the week\n");

        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }

        scanner.close();
    }
}
