package primeFactors;

import java.util.*;

public class PrimeFactorsGenerator {

    public TreeSet<Integer> generate(int number){
        TreeSet<Integer> list = new TreeSet<>();

        for (int i = 2; i<= number; i++){
            while(number%i==0) {
                list.add(i);
                number = number / i;
            }
        }
        return list;
    }
}
