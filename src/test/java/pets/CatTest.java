package pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void setCatNameTest(){
        //Given
        Cat cat = new Cat("Coco");
        String expected = "Buckets";

        //When
        cat.setName("Buckets");
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getCatNameTest(){
        //Given
        Cat cat = new Cat("Coco");
        String expected = "Buckets";

        //When
        cat.setName("Buckets");
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void catSpeakTest(){
        //Given
        Cat cat = new Cat("Coco");
        String expected = "meow!";

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
