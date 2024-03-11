package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void TestCreateDog() {
        //Given
        Date expectedDate = new Date();
        String expectedName = "Tuckie";
        Integer expectedID = 2;

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
    public void TestCreateCat(){
        //Given
        Date expectedDate = new Date();
        String expectedName = "Mittens";
        Integer expectedID = 2;

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
}
