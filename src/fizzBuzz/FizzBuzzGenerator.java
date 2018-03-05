/**
 * TWU 101 Assignments
 * Fizz Buzz Exercises
 *
 * @author  Willany Silva
 * @since   2018-03-01
 */
package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {

    public String fizzBuzz(int number){
        List list = new ArrayList();
        for (int i = 1; i <= number; i++){
            //Instead of numbers divisible by three and five print "FizzBuzz".
            if(divisibleByThree(i) && divisibleByFive(i)){
                list.add("FizzBuzz");
                //Instead of numbers divisible by five print "Buzz".
            }else if(divisibleByThree(i)){
                list.add("Fizz");
                //Instead of numbers divisible by three print "Fizz".
            }else if(divisibleByFive(i)){
                list.add("Buzz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return String.join("\n", list);
    }

    //return a boolean for a number who is or not divisible by three
    public boolean divisibleByThree(int number){
        return (number % 3 == 0);
    }

    //return a boolean for a number who is or not divisible by five
    public boolean divisibleByFive(int number){
        return (number % 5 == 0);
    }

}
