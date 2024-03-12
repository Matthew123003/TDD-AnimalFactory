package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.*;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



    @Test
    public void testMakeNewCat(){
        // Given
        String givenName = "Mittens";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthdate, givenId);
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();
        Integer actualId = cat.getId();

        //Then
        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenBirthdate, actualDate);
        Assert.assertEquals(givenId, actualId);

    }

    @Test
    public void testSpeak(){
        //Given
        String givenSpeak = "meow!";

        //When
        Cat cat = new Cat(null,null,null);
        String actualSpeak = cat.speak();

        //Then
        Assert.assertEquals(givenSpeak, actualSpeak);

    }

    @Test
    public void testSetBirthDate(){
        //Given
        Date givenDate = new Date();

        //When
        Cat cat = new Cat(null,givenDate,null);
        Date actualDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(givenDate, actualDate);

    }

    @Test
    public void testFood(){
        //Given
        Cat cat = new Cat(null,null,null);
        Food food = new Food();
        Integer expected = 1;

        //When
        cat.eat(food);


        //Then
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());


    }

    @Test
    public void testGetId(){
        //Given
        Integer givenId = 1;

        //When
        Cat cat = new Cat(null,null,givenId);
        Integer actualId = cat.getId();

        //Then
        Assert.assertEquals(givenId, actualId);

    }

    @Test
    public void testAnimalInheritance(){
        // Cat() instanceof Animal;
        Cat cat = new Cat(null, null,null);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance(){
        // Cat() instanceof Mammal;
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }

}
