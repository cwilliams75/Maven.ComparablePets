package pethouse;

import pets.Bird;
import pets.Cat;
import pets.Dog;
import pets.Pets;
import utilities.Console;
import utilities.Messages;

import java.util.ArrayList;
import java.util.List;

public class PetHouse {

    Integer numOfPets;
    List<Pets> petHouse;
    Pets newPet;
    Messages messages = new Messages();
    Console console = new Console(System.in,System.out);


    public void numberOfPets(){
        Integer result = console.getIntegerInput("How many pets do you have?");
        if(result <= 0){
            console.println("You must have made a mistake. Try again!");
            numberOfPets();
        } else if(result > 5){
            console.println("Perhaps you should try a farm animal tracker! The limit of track-able pets here is 5");
            numberOfPets();
        } else this.numOfPets = result;
    }

    public void placePetsInPetHouse(){
        this.petHouse = new ArrayList<>();
        for (int i = 1; i <= this.numOfPets; i++) {
            evalTypeOfPetAndCreateNewPet();
            this.newPet.setType();
            petHouse.add(this.newPet);
        }
    }

    //1 = Dog 2 = Cat 3 = Bird
    public void evalTypeOfPetAndCreateNewPet(){
        Integer result = messages.promptForTypeOfPet();
        if(result == 1){
            this.newPet = new Dog(messages.promptForNameOfPet());
        }else if(result == 2){
            this.newPet = new Cat(messages.promptForNameOfPet());
        }else {
            this.newPet = new Bird(messages.promptForNameOfPet());
        }
    }

    public void printPetsInPetHouse(){
        for (Pets pet : petHouse) {
            String type = petType(pet);
            String speak = pet.speak();
            console.println(pet.getName() + " the " + type + " says " + speak);
        }
    }

    public String petType(Pets pet) {
        if(pet instanceof Dog){
            return "dog";
        }else if(pet instanceof Cat){
            return "cat";
        }else return "bird";
    }

    public void setNumOfPets(Integer numOfPets) {
        this.numOfPets = numOfPets;
    }

    //for testing
    public void setTypeAndAddPetForTesting(Pets pet){
        pet.setType();
        this.petHouse.add(pet);
    }
}
