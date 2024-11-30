class PizzaFactory {
    public Pizza makePizza(String type) {
        if (type.equalsIgnoreCase("Cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("Pepperoni")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Varian " + type + " Pizza tidak tersedia:");
        }
    }
}