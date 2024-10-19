public class Delivery extends PaymentService {
    private final Status status;
    private final City city;
    private final ServicePackage servicePackage;
    private final int weight;
    private final int priceItem;
    private final int quantity;
    private final String productName;

    public Delivery(String paymentMethod,Status status, City city, ServicePackage servicePackage, int weight,
                    int priceItem, int quantity, String productName) {
        super(paymentMethod);
        this.status = status;
        this.city = city;
        this.servicePackage = servicePackage;
        this.weight = weight;
        this.priceItem = priceItem;
        this.quantity = quantity;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public int getWeight() {
        return weight;
    }

    public Status getStatus() {
        return status;
    }

    public City getCity() {
        return city;
    }

    public ServicePackage getServicePackage() {
        return servicePackage;
    }
}
