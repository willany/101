package diamond;

import asterisk.AsteriskGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondGeneratorTest {

    DiamondGenerator diamondGenerator;
    String space = " ";

    @Before
    public void setUp() {
        diamondGenerator = new DiamondGenerator();

    }

    @Test
    public void printIsoscelesTriangleTest(){
        //equal
        Assert.assertEquals(  space + space + space + space + "*\n" + space + space + space +"***\n" + space + space + "*****\n" + space + "*******\n" + "*********", diamondGenerator.printIsoscelesTriangle(5));
        Assert.assertEquals(space + space + "*\n" + space +  "***\n" + "*****", diamondGenerator.printIsoscelesTriangle(3));
        Assert.assertEquals("*", diamondGenerator.printIsoscelesTriangle(1));

        //not equal
        Assert.assertNotEquals("*", diamondGenerator.printIsoscelesTriangle(-1));
    }

    @Test
    public void printDiamondTest(){
        //equal
        Assert.assertEquals(space + space + "*\n" + space + "***\n" + "*****\n" + space + "***\n" + space + space + "*", diamondGenerator.printDiamond(3));
        Assert.assertEquals("*", diamondGenerator.printDiamond(1));
        Assert.assertEquals("", diamondGenerator.printDiamond(0));

        //not equal
        Assert.assertNotEquals("*", diamondGenerator.printDiamond(2));

    }

    @Test
    public void printDiamondWithNameTest(){
        //equal
        Assert.assertEquals(space + space + "*\n" + space + "***\n" + "WILLANY\n" + space + "***\n" + space + space + "*", diamondGenerator.printDiamondWithName(3));
        Assert.assertEquals("", diamondGenerator.printDiamond(0));

        //not equal
        Assert.assertNotEquals(space + "*\n", diamondGenerator.printDiamondWithName(-1));

    }

}