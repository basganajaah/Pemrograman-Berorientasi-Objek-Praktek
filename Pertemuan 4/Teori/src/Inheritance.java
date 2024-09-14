class Animal {
    public void makeSound() {
        System.out.println("Suara: ");
    }
}

class Dog extends Animal { // Inheritance
    @Override
    public void makeSound() {
        System.out.println("Anjing: Guk guk!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Kucing: Meow meow!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal sound = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        sound.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
