class HasMoneyState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachineContext context, int amount) {
        System.out.println("Tambahan uang dimasukkan: " + amount);
        context.addBalance(amount);
    }

    @Override
    public void selectProduct(VendingMachineContext context, String product) {
        int productPrice = context.getProductPrice(product);
        if (productPrice == -1) {
            System.out.println("Product tidak tersedia.");
        } else if (context.getBalance() >= productPrice) {
            System.out.println("Produk dipilih: " + product);
            context.reduceBalance(productPrice);
            context.setState(new DispenseState(product));
        } else {
            System.out.println("Uang tidak cukup. Masukkan uang lagi.");
        }
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        System.out.println("Pilih produk terlebih dahulu!");
    }
}