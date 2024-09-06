class FoodItems {
    private String foodName;
    private double price;
    private int stock;

    public FoodItems(String foodName, double price, int stock) {
        this.foodName = foodName;
        this.price = price;
        this.stock = stock;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isInStock(int quantity) {
        return stock >= quantity;
    }

    public void purchase(int quantity) {
        if (isInStock(quantity)) {
            stock -= quantity;
            System.out.println(quantity + "x " + foodName + " telah dipesan. Stok tersisa: " + stock);
        } else {
            System.out.println("Maaf, hanya ada " + stock + "x " + foodName + " tersedia.");
        }
    }
}
