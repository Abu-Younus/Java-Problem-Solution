import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your year: ");
        int year = scan.nextInt();
        System.out.println(getLeapYear(year));
    }

    //get leap year method
    public static int getLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is leap year!");
        } else {
            System.out.println(year + " is not leap year");
        }
        return year;
    }
}
