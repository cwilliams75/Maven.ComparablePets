package io.zipcoder;


import pethouse.PetHouse;
import utilities.Messages;

public class Application {

    public static void main(String[] args) {
        Messages messages = new Messages();
        PetHouse pethouse = new PetHouse();
        messages.welcomeMessage();
        messages.trackPetMessage();
        pethouse.numberOfPets();
        pethouse.placePetsInPetHouse();
        pethouse.printPetsInPetHouse();

    }
}
