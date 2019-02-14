package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void createDogTest() {
        //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

        String givenName = "Chaaaalie";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrieveBirthDate = dog.getBirthDate();
        Integer retrieveId = dog.getId();

        //Then
        Assert.assertEquals(retrievedName, givenName);
        Assert.assertEquals(retrieveBirthDate, givenBirthDate);
        Assert.assertEquals(retrieveId, givenId);

    }

    @Test
    public void createCatTest() {
        //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

        String givenName = "Davis the Cat";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retreiveName = dog.getName();
        Date retrieveBirthDate = dog.getBirthDate();
        Integer retrieveId = dog.getId();

        Assert.assertEquals(retreiveName, givenName);
        Assert.assertEquals(retrieveBirthDate, givenBirthDate);
        Assert.assertEquals(retrieveId, givenId);
    }
}
