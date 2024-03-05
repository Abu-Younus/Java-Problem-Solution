import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,55,66,84,15,158,100};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int key = scan.nextInt();
        getBinarySearch(arr,key);
    }

    public static void getBinarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if(arr[mid] < key) {
                first = mid + 1;
            } else if(arr[mid] == key) {
                System.out.println("Element is found index of " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        if(first > last) {
            System.out.println("Element is not found");
        }
    }
}
