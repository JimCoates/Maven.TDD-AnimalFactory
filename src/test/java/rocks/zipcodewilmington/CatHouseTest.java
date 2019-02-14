package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    private CatHouse casa;
    private Cat cat;
    private Cat cat2;

    @Before
    public void setup(){
        this.casa = new CatHouse();
        this.cat = new Cat("Tigger", new Date(8), 007);
        this.cat2 = new Cat("Rusty", new Date(9), 9);
    }

    @After
    public void tearDown (){

        this.casa.clear();
    }

    @Test
    public void testAddCat() {
        // TODO - Create tests for `void add(Cat cat)`
        CatHouse.add(cat);
        Integer count = 1;

        Assert.assertEquals(count, CatHouse.getNumberOfCats());

    }


    @Test
    public void testRemoveCatId() {
        // TODO - Create tests for `void remove(Integer id)`
        CatHouse.remove(9);
        Integer count = 0;

        Assert.assertEquals(count, CatHouse.getNumberOfCats());
    }


    @Test
    public void testRemoveCat() {
        // TODO - Create tests for `void remove(Cat cat)`
        CatHouse.remove(cat);
        Integer count = 0;

        Assert.assertEquals(count, CatHouse.getNumberOfCats());
    }

    @Test
    public void testGetCatByID() {
        // TODO - Create tests for `Cat getCatById(Integer id)`
        CatHouse.add(cat);

        Assert.assertEquals(cat, CatHouse.getCatById(007));
    }

    @Test
    public void testGetNumberOfCat(){
        // TODO - Create tests for `Integer getNumberOfCats()`
        CatHouse.add(cat);
        CatHouse.add(cat2);

        Integer expected = 2;

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());

    }



}
