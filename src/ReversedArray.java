public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,55,6,55,70,100};
        getReversedArray(arr);
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
    }
}
