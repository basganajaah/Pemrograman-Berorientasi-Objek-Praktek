abstract class Employee<T> {
    protected T id;
    protected String name;

    public Employee(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculatePayment();

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
    }
}