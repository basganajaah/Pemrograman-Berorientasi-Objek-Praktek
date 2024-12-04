public class StrategyPatternMain {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new GopayPayment());
        context.pay(150000);

        context.setPaymentStrategy(new ShopeepayPayment());
        context.pay(225000);

        context.setPaymentStrategy(new DanaPayment());
        context.pay(138500);
    }
}
