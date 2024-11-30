import java.util.HashMap;
import java.util.Map;

class VendingMachineContext {
    private VendingMachineState state;
    private int balance;
    private final Map<String, Integer> products;

    public VendingMachineContext() {
        this.state = new IdleState();
        this.balance = 0;
        this.products = new HashMap<>();
        products.put("Teh Botol Sosro", 5);
        products.put("Le Minerale", 3);
        products.put("Fresh Tea Madu", 8);
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    public void reduceBalance(int amount) {
        balance -= amount;
    }

    public int getProductPrice(String product) {
        return products.getOrDefault(product, -1);
    }

    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }

    public void selectProduct(String product) {
        state.selectProduct(this, product);
    }

    public void dispenseProduct() {
        state.dispenseProduct(this);
    }
}