public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        if (strategy == null) {
            throw new IllegalStateException("Metode pembayaran tersebut tidak tersedia!");
        }
        strategy.pay(amount);
    }
}