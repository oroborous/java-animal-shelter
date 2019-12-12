package chapter10;

// A Cat "is-a" Animal
public class Cat extends Animal {
    // This field is unique to Cats
    private boolean fivPos;

    // Subclass must always call a superclass constructor
    public Cat(String name, int age) {
        // Call to superclass constructor must be first line in constructor
        super(name, age);
    }

    public boolean isFivPos() {
        return fivPos;
    }

    public void setFivPos(boolean fivPos) {
        this.fivPos = fivPos;
    }

    @Override
    public String toString() {
        // "name" and "age" are still private in Animal
        // Don't have access, even in a subclass
        //
        // return name + " (Cat, age " + age + ", " + (fivPos ? "FIV+" : "FIV-") + ")";

        return getName() + " (Cat, age " + getAge() + ", " + (fivPos ? "FIV+" : "FIV-") + ")";
    }
}
