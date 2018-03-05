package fizzBuzz;

import fizzBuzz.FizzBuzzGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzGeneratorTest {

    FizzBuzzGenerator fizzBuzzGenerator;

    @Before
    public void setUp() {
        fizzBuzzGenerator = new FizzBuzzGenerator();

    }

    @Test
    public void divisibleByThreeTest(){
        //equal
        Assert.assertEquals(true, fizzBuzzGenerator.divisibleByThree(9));
        Assert.assertEquals(true, fizzBuzzGenerator.divisibleByThree(3));

        //not equal
        Assert.assertNotEquals(true, fizzBuzzGenerator.divisibleByThree(5));
        Assert.assertNotEquals(true, fizzBuzzGenerator.divisibleByThree(-1));
    }

    @Test
    public void divisibleByFiveTest(){
        //equal
        Assert.assertEquals(true, fizzBuzzGenerator.divisibleByFive(15));
        Assert.assertEquals(true, fizzBuzzGenerator.divisibleByFive(5));

        //not equal
        Assert.assertNotEquals(true, fizzBuzzGenerator.divisibleByFive(3));
        Assert.assertNotEquals(true, fizzBuzzGenerator.divisibleByFive(-1));
    }

    @Test
    public void fizzBuzzTest(){
        //equal
        Assert.assertEquals(1 + "\n" + 2 + "\n" + "Fizz", fizzBuzzGenerator.fizzBuzz(3));
        Assert.assertEquals(
                1 + "\n" + 2 + "\n" + "Fizz"  + "\n" + 4  + "\n" +
                        "Buzz"  + "\n" + "Fizz"  + "\n" + 7  + "\n" + 8  + "\n" +
                        "Fizz"  + "\n" + "Buzz"  + "\n" +  11  + "\n" + "Fizz"  +
                        "\n" + 13  + "\n" + 14  + "\n" + "FizzBuzz", fizzBuzzGenerator.fizzBuzz(15));

        //not equal
        Assert.assertNotEquals(1, fizzBuzzGenerator.fizzBuzz(3));
        Assert.assertNotEquals(1, fizzBuzzGenerator.fizzBuzz(-1));
    }

}
