class PartTimeEmployee <T> extends Employee <T> {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(T id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        int salary = (int) (hoursWorked * hourlyRate);
        System.out.println("Gaji Employee (" + name + ") : Rp " + salary);

        return 0;
    }
}
