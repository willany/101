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

    private final String NAME = "WILLANY";

    //Helper

    //Add spaces
    public String addSpace(int line_numbers, int line){
        String spaces = "";
        for (int j = line_numbers; j > line; j--) {
            spaces += (" ");
        }
        return spaces;
    }

    //Create a base line pyramid
    public String createBaseLine(int number){
        return printAsteriskN(number * 2 - 1);
    }

    //remove line
    public List removeLastLine(List list){
        List list_empty = new ArrayList();
        if(list.size() > 1) {
            list.remove(list.size() - 1);
            return list;
        }else{
            return list_empty;
        }

    }

    //reverse pyramid
    public List reversePyramid(List pyramid){
        Collections.reverse(pyramid);
        return pyramid;
    }

    //convert to list to string
    public String listToStringWithSeparator(String separator, List list){
        String string = String.join(separator, list);
        return string;
    }


    public List<String> createPyramid(int number){

        List pyramid = new ArrayList();
        String spaces, asterisks;

        for (int count = 1; count <= number; count++) {
            spaces = addSpace(number, count);
            asterisks = printAsteriskN(count * 2 - 1);
            pyramid.add(spaces + asterisks);
        }

        return pyramid;
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
        String diamond;

        //creating a pyramid
        List pyramid_list = createPyramid(number);
        pyramid_list = removeLastLine(pyramid_list);
        String pyramid = listToStringWithSeparator("\n", pyramid_list);

        //creating a inverted pyramid
        List inverted_pyramid_list = createPyramid(number);
        inverted_pyramid_list = removeLastLine(inverted_pyramid_list);
        inverted_pyramid_list = reversePyramid(inverted_pyramid_list);
        String inverted_pyramid = listToStringWithSeparator("\n", inverted_pyramid_list);

        //create a baseline
        String baseLine = createBaseLine(number);

        if(!pyramid.isEmpty()){
            diamond = String.join("\n", pyramid, baseLine, inverted_pyramid);
        }else{
            diamond = baseLine;
        }

        return diamond;

    }

    //Diamond with Name
    //Given a number n, print a centered diamond with your name in place of the middle line.
    public String printDiamondWithName(int number) {
        String diamond;

        //creating a pyramid
        List pyramid_list = createPyramid(number);
        pyramid_list = removeLastLine(pyramid_list);
        String pyramid = listToStringWithSeparator("\n", pyramid_list);

        //creating a inverted pyramid
        List inverted_pyramid_list = createPyramid(number);
        inverted_pyramid_list = removeLastLine(inverted_pyramid_list);
        inverted_pyramid_list = reversePyramid(inverted_pyramid_list);
        String inverted_pyramid = listToStringWithSeparator("\n", inverted_pyramid_list);

        //create a baseline
        String baseLine = NAME;

        if(!pyramid.isEmpty()){
            diamond = String.join("\n", pyramid, baseLine, inverted_pyramid);
        }else{
            diamond = baseLine;
        }

        return diamond;

    }
}
