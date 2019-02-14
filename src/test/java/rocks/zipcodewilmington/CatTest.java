package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    private Cat cat;

    @Before
    public void setup() {
        this.cat = new Cat("Tigger", new Date(8), 007);

    }

    @Test
    public void setName() {
        // TODO - Create tests for `void setName(String name)`

        //Given
        String expected = "Tigger";

        //When
        cat.setName(expected);
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        // TODO - Create tests for `speak`

        //Given
        String expected = "meow!";

        //When

        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetBirthdate() {
        // TODO - Create tests for `setBirthDate(Date birthDate)`

        //Given
        Date expected = new Date(8);

        //When
        Date actual = cat.getBirthDate();

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
        cat.eat(food);

        //Then
        Assert.assertEquals(eatenMeals, cat.getNumberOfMealsEaten());
    }

   @Test
   public void testGetId() {
       // TODO - Create tests for `Integer getId()`

       //Given
       Integer expected = 007;

       //When
       cat.getName();

       //Then
       Assert.assertEquals(expected,cat.getId());

   }
    @Test
   public void testInstanceOf() {
       // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

       //Given
       Boolean expected = true;

       //When
       Boolean actual = cat instanceof Animal;

       //Then
       Assert.assertEquals(expected, actual);
   }

    @Test
    public void testInstanceOf2() {
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

        //Given
        Boolean expected = true;

        //When
        Boolean actual = cat instanceof Mammal;

        //Then
        Assert.assertEquals(expected, actual);
    }



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

}
