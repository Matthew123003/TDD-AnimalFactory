package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testMakeNewDog(){
        // Given
        String givenName = "Mittens";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        //When
        Dog dog = new Dog(givenName, givenBirthdate, givenId);
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        //Then
        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenBirthdate, actualDate);
        Assert.assertEquals(givenId, actualId);

    }

    @Test
    public void testSpeak(){
        //Given
        String givenSpeak = "bark!";

        //When
        Dog dog = new Dog(null,null,null);
        String actualSpeak = dog.speak();

        //Then
        Assert.assertEquals(givenSpeak, actualSpeak);

    }

    @Test
    public void testSetBirthDate(){
        //Given
        Date givenDate = new Date();

        //When
        Dog dog = new Dog(null,givenDate,null);
        dog.setBirthDate(givenDate);
        Date actualDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(givenDate, actualDate);

    }

    @Test
    public void testFood(){
        //Given
        Dog dog = new Dog(null,null,null);
        Food food = new Food();
        Integer expected = 1;

        //When
        dog.eat(food);


        //Then
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());


    }

    @Test
    public void testGetId(){
        //Given
        Integer givenId = 1;

        //When
        Dog dog = new Dog(null,null,givenId);
        Integer actualId = dog.getId();

        //Then
        Assert.assertEquals(givenId, actualId);

    }

    @Test
    public void testAnimalInheritance(){
        // Cat() instanceof Animal;
        Dog dog = new Dog(null, null,null);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance(){
        // Cat() instanceof Mammal;
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }
    
}
