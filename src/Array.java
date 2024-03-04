import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Array {
    public static void main(String[] args) {

        int[] arr = {2,3,4,1,55,6,55,70,100};

        System.out.println("Max: "+getMax(arr));

        System.out.println("Second Max: "+getSecondMax(arr));

        System.out.println("Min: "+getMin(arr));

        System.out.println("Second Min: "+getSecondMin(arr));

        System.out.println("Sum: "+getSum(arr));

        System.out.println("Even : "+getEven(arr));

        System.out.println("Odd : "+ getOdd(arr));

        System.out.println("Duplicate element in array is: " + getDuplicateElement(arr));

        getReversedArray(arr);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your linear search number: ");
        int num = scan.nextInt();
        System.out.print("Linear search element find is: " + getLinearSearch(arr, num));
        System.out.println();
    }
    //get max method
    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //get second max method
    public static int getSecondMax(int[] arr) {
        int max = getMax(arr);
        int secondMax = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    //get min method
    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //get second min method
    public static int getSecondMin(int[] arr) {
        int min = getMin(arr);
        int secondMin = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < secondMin && arr[i] > min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    //get sum method
    public static int getSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //get even method
    public static int getEven(int[] arr) {
        int even = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    //get odd method
    public static int getOdd(int[] arr) {
        int odd = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    //get duplicate element method
    public static int getDuplicateElement(int[] arr) {
        int duplicateElement = 0;
        for(int i = 0; i < arr.length; i++) {
            duplicateElement = duplicateElement ^ arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            duplicateElement = duplicateElement ^ i;
        }
        return duplicateElement;
    }

    //get reverse array method
    public static void getReversedArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - i - 1];
        }
        System.out.print("Reversed array is: ");
        for(int i : reverse) {
            System.out.print(i + " ");
        }
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