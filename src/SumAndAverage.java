public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,55,6,55,70,100};

        System.out.println("Sum: " + getSum(arr));
        System.out.println("Average: " + getAverage(arr));
    }

    //get sum method
    public static int getSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //get average method
    public static double getAverage(int[] arr) {
        int sum = getSum(arr);
        double average = sum / arr.length;
        return average;
    }
}
