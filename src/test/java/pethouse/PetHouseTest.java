package pethouse;

import org.junit.Assert;
import org.junit.Test;
import pets.Bird;
import pets.Cat;
import pets.Dog;
import pets.Pets;
import utilities.SortList;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;

public class PetHouseTest {

    @Test
    public void sortNameTest(){
        //Given
        PetHouse petHouse = new PetHouse();
        petHouse.setNumOfPets(3);
        petHouse.petHouse = new ArrayList<>();
        Pets dog = new Dog("Bernie");
        Pets cat = new Cat("Bingley");
        Pets bird = new Bird("Tweety");
        petHouse.petHouse.add(bird);
        petHouse.petHouse.add(cat);
        petHouse.petHouse.add(dog);

        //When
        Collections.sort(petHouse.petHouse);


        //Then
        Assert.assertThat(petHouse.petHouse.get(0).getName(), is("Bernie"));
        Assert.assertThat(petHouse.petHouse.get(1).getName(), is("Bingley"));
        Assert.assertThat(petHouse.petHouse.get(2).getName(), is("Tweety"));

    }

    @Test
    public void sortTypeTest(){
        //Given
        SortList sortlist = new SortList();
        PetHouse petHouse = new PetHouse();
        petHouse.setNumOfPets(3);
        petHouse.petHouse = new ArrayList<>();
        Pets dog = new Dog("Bernie");
        Cat cat = new Cat("Bernie");
        Pets bird = new Bird("Bernie");
        petHouse.setTypeAndAddPetForTesting(dog);
        petHouse.setTypeAndAddPetForTesting(cat);
        petHouse.setTypeAndAddPetForTesting(bird);

        //When
        Collections.sort(petHouse.petHouse, sortlist);

        //Then
        Assert.assertTrue(petHouse.petHouse.get(0) instanceof Bird);
        Assert.assertTrue(petHouse.petHouse.get(1) instanceof Cat);
        Assert.assertTrue(petHouse.petHouse.get(2) instanceof Dog);
    }

    @Test
    public void petTypeTest(){
        PetHouse petHouse = new PetHouse();
        Bird bird = new Bird("feathers");
        String expected = "bird";
        String actual = petHouse.petType(bird);
        Assert.assertEquals(expected,actual);
    }
}
