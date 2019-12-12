package chapter10;

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

        // read animal file into list
        // give animal list to shelter
    }

    private void printMainMenu() {
        System.out.println();
        System.out.println();
        System.out.println("WELCOME to the Shelter Mgmt System");
        System.out.println(shelter.toString());
        System.out.println("1. List animals for adoption");
        System.out.println("2. Adopt an animal");
        System.out.println("3. Intake an animal");
        System.out.println("4. Exit");
        System.out.print("Enter selection: ");

        int selection = keyboard.nextInt();
        keyboard.nextLine(); // consume newline character

        System.out.println();
        System.out.println();

        if (selection == 1) {
            listAnimals();
        } else if (selection == 2) {
            adoptAnimal();
        } else if (selection == 3) {
            intakeAnimal();
        } else {
            exit();
        }
    }

    private void listAnimals() {
        ArrayList<Animal> pets = shelter.getAnimals();

        if (pets.isEmpty()) {
            System.out.println("There are no adoptable pets");
        } else {

            for (int i = 0; i < pets.size(); i++) {
                // If the Animal class has a toString, and each subclass
                // has a toString... which one gets called here?
                System.out.println((i + 1) + ". " + pets.get(i).toString());
            }

        }

        returnToMainMenu();
    }

    private void adoptAnimal() {
        ArrayList<Animal> pets = shelter.getAnimals();

        if (pets.isEmpty()) {
            System.out.println("There are no adoptable pets");
        } else {

            for (int i = 0; i < pets.size(); i++) {
                System.out.println((i + 1) + ". " + pets.get(i).toString());
            }

            System.out.print("Select which pet to adopt: ");

            int selection = keyboard.nextInt();

            Animal pet = shelter.adoptAnimal(selection - 1);

            System.out.println("You have adopted " + pet.toString());
        }

        returnToMainMenu();
    }

    private void intakeAnimal() {
        // Animal variable can hold an Animal object (or any
        // of its subclasses)
        Animal animal = null;

        // Depending on user's answer, we will instantiate
        // either a new Dog() or a new Cat()
        System.out.println("Dog or cat?: ");
        String species = keyboard.nextLine();

        // Need name and age for both Dogs and Cats
        System.out.print("Animal's name: ");
        String name = keyboard.nextLine();
        System.out.print("Animals's age: ");
        int age = keyboard.nextInt();

        if (species.equalsIgnoreCase("dog")) {
            // If it's a Dog, we have all the info we need
            // to create a Dog object
            animal = new Dog(name, age);
        } else if (species.equalsIgnoreCase(("cat"))) {
            // If it's a Cat, need to get the FIV status
            System.out.print("FIV positive? ");
            boolean fivPos = keyboard.nextBoolean();
            // Now we have all the info to create a Cat object
            animal = new Cat(name, age, fivPos);
        } else {
            System.out.println("Invalid species");
        }

        // The animal variable may have either a Dog object or
        // a Cat object in it... either way, it's an Animal object!
        shelter.intakeAnimal(animal);

        returnToMainMenu();
    }

    private void returnToMainMenu() {
        System.out.println("Press enter to return to menu");
        keyboard.nextLine();
        printMainMenu();
    }

    private void exit() {
        System.out.println("Writing info to files...");

        // Get animal list from shelter
        // Write animal list to file

        System.out.println("THANK YOU for using the Shelter Mgmt System");
    }

}
