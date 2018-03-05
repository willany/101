package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {

    public String fizzBuzz(){
        List list = new ArrayList();
        for (int i = 1; i <= 100; i++){
            //Instead of numbers divisible by three and five print "FizzBuzz".
            if(divisible_by_three(i) && divisible_by_five(i)){
                list.add("FizzBuzz");
                //Instead of numbers divisible by five print "Buzz".
            }else if(divisible_by_three(i)){
                list.add("Buzz");
                //Instead of numbers divisible by three print "Fizz".
            }else if(divisible_by_five(i)){
                list.add("Fizz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return String.join("\n", list);
    }

    //return a boolean for a number who is or not divisible by three
    public boolean divisible_by_three(int number){
        return (number % 3 == 0);
    }

    //return a boolean for a number who is or not divisible by five
    public boolean divisible_by_five(int number){
        return (number % 5 == 0);
    }

}
