/**
 * TWU 101 Assignments
 * Triangle Exercises
 *
 * @author  Willany Silva
 * @since   2018-03-01
 */
package asterisk;

import java.util.StringJoiner;

public class AsteriskGenerator {

    //assignment 01
    //easiest exercise ever
    //print one asterisk to the console.
    public String printAsterisk(){
        return "*";
    }

    //assignment 02
    //draw a horizontal line
    //given a number n, print n asterisks on one line.
    public String printAsteriskN(int number){
        String asterisks = "";
        int count = 0;
        while (count < number){
            asterisks += printAsterisk();
            count = count + 1;
        }
        return asterisks;
    }

    //assignment 03
    //draw a vertical line
    //given a number n, print n lines, each with one asterisks
    public String printVerticalLine(int number){
        int count = 0;
        StringJoiner joiner = new StringJoiner("\n");

        while (count < number){
            joiner.add(printAsterisk());
            count = count + 1;
        }
        return joiner.toString();
    }

    //assignment 04
    //draw a right triangle
    //Given a number n, print n lines, each with one more asterisk than the last
    // (i.e. one on the first line, two on the second,etc.)
    public String printTriangle(int number){
        StringJoiner joiner = new StringJoiner("\n");

        for (int count = 1; count <= number; count++) {
            joiner.add(printAsteriskN(count));
        }
        return joiner.toString();
    }


}
