import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    private ArrayList<Cat> cats;
    private ArrayList<Dog> dogs;

    public AnimalShelter() {
        cats = new ArrayList<>();
        dogs = new ArrayList<>();
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public void setCats(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }

    public void intakeCat(Cat cat) {
        cats.add(cat);
    }

    public void intakeDog(Dog dog) {
        dogs.add(dog);
    }

    public Cat adoptCat(int num) {
        if (num < cats.size()) {
            return cats.remove(num);
        }
        return null;
    }

    public Dog adoptDog(int num) {
        if (num < dogs.size()) {
            return dogs.remove(num);
        }
        return null;
    }

    @Override
    public String toString() {
        return "This shelter has " + cats.size() + " cats and " + dogs.size() + " dogs.";
    }
}
