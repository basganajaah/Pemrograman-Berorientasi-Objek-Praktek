public abstract class PaymentService {
    private final String paymentMethod;

    public PaymentService(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        if (paymentMethod.equalsIgnoreCase("cash")) {
            return "pending";
        } else {
            return "succeed";
        }
    }
}
