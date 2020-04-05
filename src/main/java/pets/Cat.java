package pets;

public class Cat extends Pets {

    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "meow!";
    }
}
