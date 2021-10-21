import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int negSum = 0;
        int posSum = 0;
        // declare and instantiate a Scanner variable and object

        // declare and initialize variables for a positive and negative sum

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(num>0) {
                posSum += num;
            }
            if(num<0) {
                negSum += num;
            }
            /* in this block, allow the user to input a number and add the number to the appropriate sum */


        } // end of for loop
        System.out.println("The positive sum is: " + posSum);
        System.out.println("The negative sum is: " + negSum);

        // output the sums. Make sure the format matches the sample

    }
}

