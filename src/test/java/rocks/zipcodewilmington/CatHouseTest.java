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
        Cat cat = new Cat("mittens", null, 2454);
        Integer expectedCats = 1;

        //When
        CatHouse.add(cat);
        Integer actualCats = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCats, actualCats);

    }

    @Test
    public void testRemoveIntegerId(){
        //Given
        Cat cat = new Cat("mittens",null,20);
        Integer expectedCats = CatHouse.getNumberOfCats();


        //When
        CatHouse.add(cat);
        CatHouse.remove(20);
        Integer actualCats = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCats, actualCats);
        CatHouse.clear();
    }

    @Test
    public void testRemoveCat(){
        //Given
        Cat cat = new Cat("mittens" , null, 25);
        Integer expectedCats = CatHouse.getNumberOfCats();

        //When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer actualCats = CatHouse.getNumberOfCats();

        //Then
       Assert.assertEquals(expectedCats, actualCats);
       CatHouse.clear();

    }

    @Test
    public void testGetCatById(){
        //Given
        Cat cat = new Cat("mittens", null, 5674);
        Cat expectedId = cat;
        //When
        CatHouse.add(cat);
        Cat actualId = CatHouse.getCatById(5674);

        //Then
        Assert.assertEquals(expectedId, actualId);
        CatHouse.clear();



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
