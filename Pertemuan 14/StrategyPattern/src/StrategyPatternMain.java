public class StrategyPatternMain {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Menggunakan Credit Card
        context.setPaymentStrategy(new GopayPayment());
        context.pay(150000);

        // Beralih ke PayPal
        context.setPaymentStrategy(new ShopeepayPayment());
        context.pay(225000);

        // Beralih ke Bank Transfer
        context.setPaymentStrategy(new DanaPayment());
        context.pay(138500);
    }
}
