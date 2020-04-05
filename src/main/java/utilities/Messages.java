package utilities;

public class Messages {

    Console console = new Console(System.in,System.out);

    public Integer promptForNumberOfPets(){
        Integer result = console.getIntegerInput("How many pets do you have?");
        if(result <= 0){
            console.println("You must have made a mistake. Try again!");
            promptForNumberOfPets();
        } else if(result > 5){
            console.println("Perhaps you should try a farm animal tracker! The limit of track-able pets here is 5");
            promptForNumberOfPets();
        }
        return result;
    }


    public Integer promptForTypeOfPet() {
        selectFromMenu();
        Integer result = console.getIntegerInput("1 = Dog\n2 = Cat\n3 = Bird");
        if(result > 3 || result == 0){
            invalidMenuSelectionPrompt();
            promptForTypeOfPet();
        }
        return result;
    }

    public String promptForNameOfPet() {
        return console.getStringInput("What is that pets name?");
    }

    public void welcomeMessage(){
        console.println("Welcome to the pet tracker!");
    }

    public void trackPetMessage(){
        console.println("Let's keep track of your pets one at a time...First what type it is and then their name :)");
    }

    public void selectFromMenu(){
        console.println("Please select from one of the following");
    }

    public void invalidMenuSelectionPrompt(){
        console.println("Invalid menu selection! Try again!");
    }
}
