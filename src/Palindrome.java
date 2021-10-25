public class Palindrome {

    public static boolean isPalindrome(int number) {
        int fifthNum = number%10;
        int fourthNum = (number%100)/10;
        int secondNuma = (number%1000);
        int secondNumb = secondNuma%10;
        int firstNum = number/10000;

        if (fifthNum==firstNum) {
            if (fourthNum==secondNumb) {
                return true;
            }
        }
        return false;
    }
    // Write your isPalindrome method in the space below. You do not need to write a main method for this program
    // Your method should be static.

}
