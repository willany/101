package primeFactors;

import fizzBuzz.FizzBuzzGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class PrimeFactorsGeneratorTest {

    PrimeFactorsGenerator primeFactorosGenerator;
    TreeSet<Integer> generate_thirty = new TreeSet<>();

    @Before
    public void setUp() {
        primeFactorosGenerator = new PrimeFactorsGenerator();
        generate_thirty.add(2);
        generate_thirty.add(3);
        generate_thirty.add(5);
    }

    @Test
    public void divisibleByThreeTest(){
        //equal
        Assert.assertEquals(new TreeSet<>(), primeFactorosGenerator.generate(1));
        Assert.assertEquals(new TreeSet<>(), primeFactorosGenerator.generate(0));
        Assert.assertEquals(generate_thirty , primeFactorosGenerator.generate(30));

        //not equal
        Assert.assertNotEquals(generate_thirty, primeFactorosGenerator.generate(5));
        Assert.assertNotEquals(generate_thirty, primeFactorosGenerator.generate(-1));
    }

}