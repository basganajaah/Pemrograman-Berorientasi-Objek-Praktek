public class DanaPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Membayar " + amount + " menggunakan DANA.");
    }
}
