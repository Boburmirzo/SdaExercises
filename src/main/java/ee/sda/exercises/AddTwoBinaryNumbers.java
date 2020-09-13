package ee.sda.exercises;

import java.util.Scanner;

public class AddTwoBinaryNumbers {

    // 100010 -> a
    // 110010 -> b
    //1010100

    // 1 + 1 = 1 -> true + true = true
    // 1 + 0 = 1 -> true + false = true

    public static void main(String[] args) {
        // 11111111111111
        long binary1, binary2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first binary number: "); // shouldn't more than 150 chars
        binary1 = in.nextLong();
        System.out.println("Enter second binary number: ");
        binary2 = in.nextLong();

        int[] sum = addTwoBinaryNumbers(binary1, binary2);
        int i = 0;

        System.out.println("Sum of two binary numbers: ");
        while (i >= 0){
            System.out.print(sum[i--]);
        }
    }
    /* Method description(what method does)
    *
    * 1. The number of argument in your method should not be
    * more than 4.
    *  2. The number of line in your method should be less than 20
    *  if it is up to 10, perfect.
    *  3. Please put spaces between operators(Before or after).
    */
    private static int[] addTwoBinaryNumbers(long binary1,
                                             long binary2){
        int i = 0, remainder = 0;
        int[] sum = new int[10];


        while (binary1 != 0 || binary2 != 0){
            sum[i] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            i++;
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if(remainder != 0){
            sum[i++] = remainder;
        }
        --i;

        return sum;
    }
}
