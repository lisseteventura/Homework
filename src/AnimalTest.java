import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal;
    @Before
    public void initializeAnimal() {
//        private Animal animal;
         animal = new Animal (4, 20, false, "Thug");
    }
    @org.junit.Test
    public void TestGetNumLegs() {
        int expected = 4;
        int actual = animal.getNumLegs();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestSetNumLegs() {
        animal.setNumLegs(5);
        int expected = 5;
        int actual = animal.getNumLegs();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestGetTopSpeed() {
        int expected = 20;
        int actual = animal.getTopSpeed();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestSetTopSpeed() {
        animal.setTopSpeed(10);
        int expected = 10;
        int actual = animal.getTopSpeed();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestGetIsEndangered() {
        boolean expected = false;
        boolean actual = animal.getIsEndangered();
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestSetIsEndangered() {
        animal.setIsEndangered(true);
        boolean expected = true;
        boolean actual = animal.getIsEndangered();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestGetName() {
        String expected = "Thug";
        String actual = animal.getName();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestSetName() {
        animal.setName("Lucky");
        String expected = "Lucky";
        String actual = animal.getName();
        Assert.assertEquals(expected, actual);
    }
}