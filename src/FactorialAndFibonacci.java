import java.util.Scanner;

public class FactorialAndFibonacci {

    public static void main(String[] args) {
        //factorial variable
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scan.nextInt();

        System.out.println("Factorial "+ num + " is = "+getFactorial(num));

        System.out.print("Fibonacci " + num + " is = ");
        for(int i = 1; i <= num; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }

    //get factorial method
    public static int getFactorial(int num) {
        if(num >= 1) {
            return num * getFactorial(num - 1);
        } else {
            return 1;
        }
    }

    //get fibonacci method
    public static int getFibonacci(int count) {
        if(count == 0) {
            return 0;
        }
        if(count == 1 || count == 2) {
            return 1;
        }
        return getFibonacci(count - 1) + getFibonacci(count - 2);
    }
}
