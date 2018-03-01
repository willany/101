public class Assignment_08 {

    public static void main(String[] args) {
        fizz_buzz();
    }

    public static void fizz_buzz(){
        for (int i = 1; i <= 100; i++){

            //Instead of numbers divisible by three and five print "FizzBuzz".
            if(divisible_by_three(i) && divisible_by_five(i)){
                System.out.println("FizzBuzz");
            //Instead of numbers divisible by five print "Buzz".
            }else if(divisible_by_three(i)){
                System.out.println("Buzz");
            //Instead of numbers divisible by three print "Fizz".
            }else if(divisible_by_five(i)){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }

        }
    }

    //return a boolean for a number who is or not divisible by three
    public static boolean divisible_by_three(int number){
        return (number % 3 == 0);
    }

    //return a boolean for a number who is or not divisible by five
    public static boolean divisible_by_five(int number){
        return (number % 5 == 0);
    }

}
