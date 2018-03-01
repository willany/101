import java.util.*;

public class Assignment_09 {
    public static void main(String[] args) {
        System.out.print(generate(30));
    }

    public static TreeSet<Integer> generate(int number){
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
