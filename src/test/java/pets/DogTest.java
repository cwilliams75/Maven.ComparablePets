package pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void setDogNameTest(){
        //Given
        Dog dog = new Dog("Ripley");
        String expected = "Ripley";

        //When
        dog.setName("Ripley");
        String actual = dog.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getDogNameTest(){
        //Given
        Dog dog = new Dog("Ripley");
        String expected = "Ripley";

        //When
        String actual = dog.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void dogSpeakTest(){
        //Given
        Dog dog = new Dog("Ripley");
        String expected = "bark!";

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
