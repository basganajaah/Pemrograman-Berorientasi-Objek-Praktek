public class EmployeeObserverExample {
    public static void main(String[] args) {
        Employee<String> employee = new Employee<>();
        Observer<String> hrObserver = new EmployeeObserver<>("HR Department");
        Observer<String> managerObserver = new EmployeeObserver<>("Manager");

        employee.addObserver(hrObserver);
        employee.addObserver(managerObserver);

        employee.setState("Nama berubah menjadi Bandyaga");
        employee.setState("Gaji berubah menjadi 1500000");
    }
}