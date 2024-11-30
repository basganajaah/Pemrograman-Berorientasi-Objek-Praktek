class DispenseState implements VendingMachineState {
    private final String product;

    public DispenseState(String product) {
        this.product = product;
    }

    @Override
    public void insertCoin(VendingMachineContext context, int amount) {
        System.out.println("Saat ini tidak dapat memasukkan uang. Keluarkan produk terlebih dahulu.");
    }

    @Override
    public void selectProduct(VendingMachineContext context, String product) {
        System.out.println("Saat ini tidak dapat memilih ulang produk. Keluarkan produk terlebih dahulu.");
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        System.out.println("Mengeluarkan produk: " + product);
        if (context.getBalance() > 0) {
            System.out.println("Sisa saldo: " + context.getBalance());
            context.setState(new HasMoneyState());
        } else {
            System.out.println("Tidak ada sisa saldo.");
            context.setState(new IdleState());
        }
    }
}