import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first integer?");
        int num1 = scan.nextInt();
        System.out.println("What is the second integer?");
        int num2 = scan.nextInt();
        if(num1>num2) {
            System.out.println(num1 + " is larger than " + num2);
        }
        if(num1==num2) {
            System.out.println(num1 + " is equal to " + num2);

        }
        if(num1<num2) {
            System.out.println(num2 + " is greater than " + num1);
        }


        // Prompt the user for two integer variables

        // Create a series of if statements that will print which number is larger or if they are equal
        // Make sure your output matches the samples or the tests will not pass.
    }
}
