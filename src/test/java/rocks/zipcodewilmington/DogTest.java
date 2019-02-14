package rocks.zipcodewilmington;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    private Dog dog;

    @Before
    public void setup() {
        this.dog = new Dog("Doggo", new Date(7), 12);

    }

    @Test
    public void testSetName() {
        // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
        //Given
        String expected = "Doogo";

        //When
        dog.setName(expected);
        String actual = dog.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSpeak() {
        // TODO - Create tests for `speak`

        //Given
        String expected = "bark!";

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthDate() {

        // TODO - Create tests for `setBirthDate(Date birthDate)`

        //Given
        Date expected = new Date(7);

        //When
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat() {
        // TODO - Create tests for `void eat(Food food)`

        //Given
        Food food = new Food();
        Integer eatenMeals = 1;

        //When
        dog.eat(food);

        //Then
        Assert.assertEquals(eatenMeals, dog.getNumberOfMealsEaten());
    }

    @Test
    public void testGetId() {

        // TODO - Create tests for `Integer getId()`

        //Given
        Integer expected = 12;

        //When
        dog.getId();

        //Then
        Assert.assertEquals(expected, dog.getId());
    }

    @Test
    public void testInstanceOf() {
        // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

        //Given
        Boolean expected = true;

        //When
        Boolean actual = dog instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstanceOf2() {
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

        //Given
        Boolean expected = true;

        //When
        Boolean actual = dog instanceof Mammal;

        //Then
        Assert.assertEquals(expected, actual);
    }

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
}
