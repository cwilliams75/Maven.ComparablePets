package pets;

public class Bird extends Pets {

    public Bird(String name) {
        super(name);
    }

    public String speak() {
        return "peep!";
    }
}
