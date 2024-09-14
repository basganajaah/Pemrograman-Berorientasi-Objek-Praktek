import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Soal1 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 15000000, 10);
        Sales sales = new Sales(product);

        // jual product sebanyak quantity 5
        sales.sellProduct(5);

        // restock product sebanyak quantity 10
        sales.restockProduct(10);

        // atur harga menjadi 14500000
        sales.updateProductPrice(14500000);

        // atur harga menjadi nilai negatif sembarang
        sales.updateProductPrice(-14500000);
    }
}
