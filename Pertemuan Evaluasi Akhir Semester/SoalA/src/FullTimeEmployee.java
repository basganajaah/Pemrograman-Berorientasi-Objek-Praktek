class FullTimeEmployee<T> extends Employee<T>{
    private double monthlySalary;

    public FullTimeEmployee(T id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePayment() {
        int salary = (int) monthlySalary;
        System.out.println("Gaji Employee (" + name + ") : Rp " + salary);

        return 0;
    }
}
