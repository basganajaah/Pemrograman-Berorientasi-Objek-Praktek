public class FactoryPatternMain {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza cheesePizza = factory.makePizza("Cheese");
        cheesePizza.prepare();
        cheesePizza.make();

        Pizza pepperoniPizza = factory.makePizza("Pepperoni");
        pepperoniPizza.prepare();
        pepperoniPizza.make();
    }
}