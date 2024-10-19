import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
        String JSON_FILE = "src/org/json/data.json";
        Gson gson = new Gson();

        Delivery[] delivery = gson.fromJson(new FileReader(JSON_FILE), Delivery[].class);
        System.out.printf("%-25s | %-10s | %-10s | %-15s | %-20s | %-15s | %-10s | %-15s | %-15s %n",
                "Product Name ", "Quantity", "Weight",
                "Destination", "Service Package", "Service Value",
                "Total", "Payment Method", "Payment Status");
        for (Delivery d : delivery) {
            System.out.printf("%-25s | %-10d | %-10d | %-15s | %-20s | %-15d | %-10d | %-15s | %-15s %n",
                    d.getProductName(),
                    d.getQuantity(),
                    d.getWeight(),
                    d.getCity().getDestination(),
                    d.getServicePackage().getService(),
                    d.getServicePackage().getValue(),
                    (d.getServicePackage().getValue() + (d.getPriceItem() * d.getQuantity())),
                    d.getPaymentMethod(),
                    d.getPaymentStatus());
        }
    }
}
