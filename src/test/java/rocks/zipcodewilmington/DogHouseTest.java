package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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
public class DogHouseTest {
    private DogHouse casa;
    private Dog dog;
    private Dog dog2;

    @Before
    public void setup() {
        this.casa = new DogHouse();
        this.dog = new Dog("Tigger", new Date(8), 77);
        this.dog2 = new Dog("Rusty", new Date(9), 88);
    }

    @After
    public void tearDown() {

        this.casa.clear();

    }

    @Test
    public void testAddDog(){
        DogHouse.add(dog);
        Integer expected = 1;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());

    }

    @Test
    public void testRemoveDogId(){
        DogHouse.remove(77);
        Integer expected = 0;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void testRemoveDog(){
        DogHouse.remove(dog);
        Integer expected = 0;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void testGetDogById(){
        DogHouse.add(dog);

        Assert.assertEquals(dog, DogHouse.getDogById(77));
    }

    @Test
    public void testGEtNumberOfDogs(){
        DogHouse.add(dog);
        DogHouse.add(dog2);

        Integer expected = 2;

        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());

    }
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
