package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDog(){
        //Given
        String expectedName = "Mittens";
        Integer expectedID = 2;
        Date expectedDate = new Date();

        //When
        Dog dog = new Dog(expectedName, expectedDate, expectedID);

        //Then
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        Integer actualID = dog.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedID, actualID);

    }

    @Test
    public void testRemoveDog1(){
        //Given
        Integer expectedID = 2;

        //When

        //Then


    }

    @Test
    public void testRemoveDog2(){
        //Given

    }

    @Test
    public void testGetDogById(){
        //Given

    }

}
