package chapter10;

// A Dog "is-a" Animal
public class Dog extends Animal {
    // Subclass must always call a superclass constructor
    public Dog(String name, int age) {
        // Call to superclass constructor must be first line in constructor
        super(name, age);
    }


    @Override
    public String toString() {
        // "name" and "age" are still private in Animal
        // Don't have access, even in a subclass
        //
        // return name + " (Dog, age " + age + ")";

        return getName() + " (Dog, age " + getAge() + ")";
    }
}
