public class Main {
    public static void main (String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1001, "Alice", 10000000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("PT2025", "Bob", 75000, 50);

        fullTimeEmployee.displayDetails();
        partTimeEmployee.displayDetails();

        System.out.println("\nGaji Full-Time");
        fullTimeEmployee.calculatePayment();
        System.out.println("Gaji Part-Time");
        partTimeEmployee.calculatePayment();
    }
}