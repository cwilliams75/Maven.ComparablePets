package pets;

public class Dog extends Pets {

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "bark!";
    }
}
