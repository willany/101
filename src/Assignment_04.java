public class Assignment_04 {
    public static void main(String[] args){

        int number = 10;
        int i = 1;
        String asterisk = "*";

        while (i <= number){
            System.out.println(asterisk);
            asterisk = asterisk + "*";
            i = i + 1;
        }
    }
}
