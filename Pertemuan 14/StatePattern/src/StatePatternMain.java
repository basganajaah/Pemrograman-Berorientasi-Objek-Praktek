public class StatePatternMain {
    public static void main(String[] args) {
        VendingMachineContext vendingMachine = new VendingMachineContext();

        vendingMachine.insertCoin(2);
        vendingMachine.selectProduct("Fresh Tea Madu");
        vendingMachine.insertCoin(6);
        vendingMachine.selectProduct("Fresh Tea Madu");
        vendingMachine.dispenseProduct();
        vendingMachine.insertCoin(20);
        vendingMachine.selectProduct("Le Minerale");
        vendingMachine.insertCoin(2);
    }
}
