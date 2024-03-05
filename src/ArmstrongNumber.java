import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scan.nextInt();
        int orignalNum = num, remainder, result = 0;

        while (orignalNum != 0) {
            remainder = orignalNum % 10;
            result = (int) (result + Math.pow(remainder,3));
            orignalNum = orignalNum / 10;
        }
        if (result == num) {
            System.out.println(num + " is an Armstrong number!");
        } else {
            System.out.println(num + " is not an Armstrong number!");
        }
    }
}
