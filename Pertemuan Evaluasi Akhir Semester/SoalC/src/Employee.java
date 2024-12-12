import java.util.ArrayList;
import java.util.List;

class Employee<T>{
    private final List<Observer<T>> observers = new ArrayList<>();
    private T state;

    public void addObserver (Observer<T> observer) {
        observers.add(observer);
    }

    public void removeObserver (Observer<T> observer) {
        observers.remove(observer);
    }

    public void setState (T state) {
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer<T> observer : observers) {
            observer.update(state);
        }
    }
}
