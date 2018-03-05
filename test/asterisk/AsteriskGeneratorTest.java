package asterisk;

import asterisk.AsteriskGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AsteriskGeneratorTest {

    AsteriskGenerator asteriskGenerator;

    @Before
    public void setUp() {
        asteriskGenerator = new AsteriskGenerator();
    }

    @Test
    public void printOneAsteriskTest(){
        //equal
        Assert.assertEquals("*", asteriskGenerator.printAsterisk());

        //not equal
        Assert.assertNotEquals("**", asteriskGenerator.printAsterisk());
    }

    @Test
    public void printAsterisksNTest(){
        //equal
        Assert.assertEquals("*****", asteriskGenerator.printAsteriskN(5));
        Assert.assertEquals("*", asteriskGenerator.printAsteriskN(1));
        Assert.assertEquals("", asteriskGenerator.printAsteriskN(-1));

        //not equal
        Assert.assertNotEquals("**", asteriskGenerator.printAsteriskN(3));
        Assert.assertNotEquals("****", asteriskGenerator.printAsteriskN(3));
    }

    @Test
    public void printVerticalLineTest(){
        //equal
        Assert.assertEquals("*\n*\n*\n*\n*\n*\n*\n*\n*\n*", asteriskGenerator.printVerticalLine(10));
        Assert.assertEquals("*\n*\n*", asteriskGenerator.printVerticalLine(3));
        Assert.assertEquals("*", asteriskGenerator.printVerticalLine(1));
        Assert.assertEquals("", asteriskGenerator.printVerticalLine(-1));

        //not equal
        Assert.assertNotEquals("****", asteriskGenerator.printVerticalLine(4));
        Assert.assertNotEquals("*", asteriskGenerator.printVerticalLine(-1));
        Assert.assertNotEquals("*\n", asteriskGenerator.printVerticalLine(1));

    }

    @Test
    public void printTriangleTest(){
        //equal
        Assert.assertEquals("*", asteriskGenerator.printTriangle(1));
        Assert.assertEquals("*\n**\n***", asteriskGenerator.printTriangle(3));
        Assert.assertEquals("*\n**\n***\n****\n*****", asteriskGenerator.printTriangle(5));
        Assert.assertEquals("", asteriskGenerator.printTriangle(-1));

        //not equal
        Assert.assertNotEquals("****", asteriskGenerator.printTriangle(4));
        Assert.assertNotEquals("*", asteriskGenerator.printTriangle(-1));
        Assert.assertNotEquals("*\n", asteriskGenerator.printTriangle(1));

    }



}