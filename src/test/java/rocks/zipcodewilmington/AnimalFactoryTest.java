package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
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
    public void TestCreateDog(String name, Date birthDate) {
        //Given
        Date expectedDate = new Date(2024, Calendar.FEBRUARY, 1);
        String expectedName = "Mittens";

        //When
        Animal dog = new Animal(expectedName, expectedDate)


    }
}
