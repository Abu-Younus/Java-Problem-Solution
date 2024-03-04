import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scan.nextInt();
        if(isPrimeNumber(num)) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is non-prime number");
        }
    }

    public static boolean isPrimeNumber(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= num / 2; i++) {
            if(num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
