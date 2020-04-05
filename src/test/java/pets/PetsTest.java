package pets;

import org.junit.Test;

public class PetsTest {

    @Test
    public void compareTest(){
        Dog dog = new Dog("fluffy");
        Cat cat = new Cat("whiskers");


        int actual = dog.compareTo(cat);
    }
}
