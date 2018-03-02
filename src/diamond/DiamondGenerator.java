/**
 * TWU 101 Assignments
 * Diamond Exercises
 *
 * @author  Willany Silva
 * @since   2018-03-01
 */
package diamond;


import asterisk.AsteriskGenerator;

import java.util.*;

public class DiamondGenerator extends AsteriskGenerator{

    //Helper
    //Add spaces
    public String addSpace(int line_numbers, int line){
        String spaces = "";
        for (int j = line_numbers; j > line; j--) {
            spaces += (" ");
        }
        return spaces;
    }


    public List<String> createPyramid(int number){

        List pyramidBuffer = new ArrayList();
        String spaces, asterisks;

        for (int count = 1; count <= number; count++) {
            spaces = addSpace(number, count);
            asterisks = printAsteriskN(count * 2 - 1);
            pyramidBuffer.add(spaces + asterisks);
        }

        return pyramidBuffer;
    }


    //Isosceles Triangle
    //Given a number n, print a centered triangle. Example for n=3:
    public String printIsoscelesTriangle(int number){
        String joiner = String.join("\n", createPyramid(number));
        return joiner;
    }


    //Diamond
    //Given a number n, print a centered diamond.
    public String printDiamond(int number) {
        List pyramid = createPyramid(number);
        pyramid.remove(pyramid.size() - 1);
        String pyramid_joined = String.join("\n", pyramid);

        List inverted_pyramid = createPyramid(number);
        inverted_pyramid.remove(inverted_pyramid.size() - 1);
        Collections.reverse(inverted_pyramid);
        String inverted_pyramid_joined = String.join("\n", inverted_pyramid);

        String baseLine = printAsteriskN(number * 2 - 1);

        return (pyramid_joined + "\n" + baseLine + "\n" + inverted_pyramid_joined);

    }
}
