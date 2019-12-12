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
}
