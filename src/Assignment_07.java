public class Assignment_07 {

    public static int number = 3;
    public static int count_min_asterisk = 1;
    public static int count_max_asterisk = 0;

    public static void main(String[] args) {

        for (int i = number-1; i >= 0; i--) {

            //printing the spaces from max to min
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }

            if(i == 0){
                System.out.print("willany");
            }else {
                //printing the asterisks from min to max
                for (int j = 0; j < count_min_asterisk; j++) {
                    System.out.print("*");
                }
            }

            System.out.print("\n");

            //the last asterisks line printed
            count_max_asterisk = count_min_asterisk;

            //iterating the asterisks by two
            count_min_asterisk = count_min_asterisk +2;
        }

        for (int i = 1; i < number; i++) {
            //printing the spaces from min to max
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //printing the asterisks from max to min
            for (int k = count_max_asterisk - 2; k > 0; k--){
                System.out.print("*");
            }

            System.out.print("\n");

            //iterating the asterisks by - two
            count_max_asterisk = count_max_asterisk - 2;

        }

    }

}
