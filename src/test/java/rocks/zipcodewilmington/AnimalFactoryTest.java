package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

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


        //When
        Dog dog = AnimalFactory.createDog(expectedName, expectedDate);

        //Then


        Assert.assertEquals(expectedName, dog.getName());
        Assert.assertEquals(expectedDate, dog.getBirthDate());



    }

    @Test
    public void TestCreateCat(){
        //Given
        Date expectedDate = new Date();
        String expectedName = "Mittens";

        //When
        Cat cat = AnimalFactory.createCat(expectedName, expectedDate);

        //Then

        Assert.assertEquals(expectedName, cat.getName());
        Assert.assertEquals(expectedDate, cat.getBirthDate());

    }
}
