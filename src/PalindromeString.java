import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        System.out.println(getPalindromeString(str));
    }

    public static boolean getPalindromeString(String str) {
        String reverseStr = "";
        for(int i = str.length() - 1; i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
            return true;
        }
        return false;
    }
}
