class IdleState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachineContext context, int amount) {
        System.out.println("Memasukkan uang: " + amount);
        context.addBalance(amount);
        context.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachineContext context, String product) {
        System.out.println("Masukkan uang terlebih dahulu!");
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        System.out.println("Masukkan uang terlebih dahulu");
    }
}