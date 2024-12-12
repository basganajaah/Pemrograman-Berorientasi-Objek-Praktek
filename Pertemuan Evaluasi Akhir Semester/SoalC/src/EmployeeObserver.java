public class EmployeeObserver<T> implements Observer<T> {
    private final String name;

    public EmployeeObserver(String name) {
        this.name = name;
    }

    @Override
    public void update (T state) {
        System.out.println(name + " menerima notifikasi: " + state);
    }
}
