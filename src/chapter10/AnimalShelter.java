package chapter10;

import java.util.ArrayList;

public class AnimalShelter {
    private ArrayList<Animal> animals;

    public AnimalShelter() {
        animals = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void intakeAnimal(Animal cat) {
        animals.add(cat);
    }

    public Animal adoptAnimal(int num) {
        if (num < animals.size()) {
            return animals.remove(num);
        }
        return null;
    }

    @Override
    public String toString() {
        return "This shelter has " + animals.size() + " animals.";
    }
}
