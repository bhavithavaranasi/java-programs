// Grandparent class
class LivingBeing {
    void breathe() {
        System.out.println("Breathing...");
    }
}

// Parent class
class Animal extends LivingBeing {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Main class
public class MultilevelInheri {
    public static void main(String[] args) {
        Dog d = new Dog();
        
        d.breathe(); // from LivingBeing
        d.eat();     // from Animal
        d.bark();    // own method
    }
}