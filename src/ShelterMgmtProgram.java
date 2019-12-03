import java.util.ArrayList;
import java.util.Scanner;

public class ShelterMgmtProgram {
    private AnimalShelter shelter = new AnimalShelter();
    private Scanner keyboard;

    public ShelterMgmtProgram() {
        keyboard = new Scanner(System.in);

        readFiles();

        printMainMenu();
    }

    private void readFiles() {
        System.out.println("Reading info from files...");

        // read cat file into list
        // give cat list to shelter

        // read dog file into list
        // give dog list to shelter
    }

    private void printMainMenu() {
        System.out.println();
        System.out.println();
        System.out.println("WELCOME to the Shelter Mgmt System");
        System.out.println(shelter.toString());
        System.out.println("1. List dogs for adoption");
        System.out.println("2. List cats for adoption");
        System.out.println("3. Adopt a dog");
        System.out.println("4. Adopt a cat");
        System.out.println("5. Intake a dog");
        System.out.println("6. Intake a cat");
        System.out.println("7. Exit");
        System.out.print("Enter selection: ");

        int selection = keyboard.nextInt();
        keyboard.nextLine(); // consume newline character

        System.out.println();
        System.out.println();

        if (selection == 1) {
            listDogs();
        } else if (selection == 2) {
            listCats();
        } else if (selection == 3) {
            adoptDog();
        } else if (selection == 4) {
            adoptCat();
        } else if (selection == 5) {
            intakeDog();
        } else if (selection == 6) {
            intakeCat();
        } else {
            exit();
        }
    }

    private void listDogs() {
        ArrayList<Dog> dogs = shelter.getDogs();

        if (dogs.isEmpty()) {
            System.out.println("There are no adoptable dogs");
        } else {

            for (int i = 0; i < dogs.size(); i++) {
                System.out.println((i + 1) + ". " + dogs.get(i).toString());
            }

        }

        returnToMainMenu();
    }

    private void listCats() {
        ArrayList<Cat> cats = shelter.getCats();

        if (cats.isEmpty()) {
            System.out.println("There are no adoptable cats");
        } else {

            for (int i = 0; i < cats.size(); i++) {
                System.out.println((i + 1) + ". " + cats.get(i).toString());
            }

        }

        returnToMainMenu();
    }

    private void adoptDog() {
        ArrayList<Dog> dogs = shelter.getDogs();

        if (dogs.isEmpty()) {
            System.out.println("There are no adoptable dogs");
        } else {

            for (int i = 0; i < dogs.size(); i++) {
                System.out.println((i + 1) + ". " + dogs.get(i).toString());
            }

            System.out.print("Select which dog to adopt: ");

            int selection = keyboard.nextInt();

            Dog dog = shelter.adoptDog(selection - 1);

            System.out.println("You have adopted " + dog.toString());
        }

        returnToMainMenu();
    }

    private void adoptCat() {
        ArrayList<Cat> cats = shelter.getCats();

        if (cats.isEmpty()) {
            System.out.println("There are no adoptable cats");
        } else {

            for (int i = 0; i < cats.size(); i++) {
                System.out.println((i + 1) + ". " + cats.get(i).toString());
            }

            System.out.print("Select which cat to adopt: ");

            int selection = keyboard.nextInt();

            Cat cat = shelter.adoptCat(selection - 1);

            System.out.println("You have adopted " + cat.toString());
        }

        returnToMainMenu();
    }

    private void intakeDog() {
        System.out.print("Dog's name: ");
        String name = keyboard.nextLine();
        System.out.print("Dog's age: ");
        int age = keyboard.nextInt();

        Dog dog = new Dog(name, age);

        shelter.intakeDog(dog);

        returnToMainMenu();
    }

    private void intakeCat() {
        System.out.print("Cat's name: ");
        String name = keyboard.nextLine();
        System.out.print("Cat's age: ");
        int age = keyboard.nextInt();
        System.out.print("FIV positive? ");
        boolean fivPos = keyboard.nextBoolean();

        Cat cat = new Cat(name, age, fivPos);

        shelter.intakeCat(cat);

        returnToMainMenu();
    }

    private void returnToMainMenu() {
        System.out.println("Press enter to return to menu");
        keyboard.nextLine();
        printMainMenu();
    }

    private void exit() {
        System.out.println("Writing info to files...");

        // Get cat list from shelter
        // Write cat list to file

        // Get dog list from shelter
        // Write dog list to file

        System.out.println("THANK YOU for using the Shelter Mgmt System");
    }

}
