import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        int reversedNum = 0, remainder;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if(originalNum == reversedNum) {
            System.out.println(originalNum + " is palindrome!");
        } else {
            System.out.println(originalNum + " is not palindrome!");
        }
    }
}
