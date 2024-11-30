interface VendingMachineState {
    void insertCoin(VendingMachineContext context, int amount);
    void selectProduct(VendingMachineContext context, String product);
    void dispenseProduct(VendingMachineContext context);
}
