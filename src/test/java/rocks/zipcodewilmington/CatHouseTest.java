package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAddCat(){
        //Given
        String expectedName = "Mittens";
        Integer expectedID = 2;
        Date expectedDate = new Date();

        //When
        Cat cat = new Cat(expectedName, expectedDate, expectedID);

        //Then
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();
        Integer actualID = cat.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedID, actualID);

    }

    @Test
    public void testRemoveCat1(){
        //Given
        Integer expectedID = 2;

        //When

        //Then


    }

    @Test
    public void testRemoveCat2(){
        //Given

    }

    @Test
    public void testGetCatById(){
        //Given

    }

    @Test
    public void testGetNumberOfCats(){
    // Given (some
    String name = "Milo";
    Date birthDate = new Date();
    Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

    // When
        CatHouse.add(animal);

    // Then
        CatHouse.getNumberOfCats();
}
}
