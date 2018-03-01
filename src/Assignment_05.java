public class Assignment_05 {
    public static void main(String[] args){

        int number = 5;
        String asterisk = "*";

        for (int i = 0; i < number; i++){
            for (int j = number; j > i; j--){
                System.out.print(" ");
            }

            System.out.println(asterisk);
            asterisk = asterisk + "**";
        }
    }
}
