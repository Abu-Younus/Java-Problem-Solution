import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,55,6,55,70,100};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scan.nextInt();
        System.out.print("Element find is: " + getLinearSearch(arr, num));
        System.out.println();
    }

    //get linear search method
    public static boolean getLinearSearch(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
