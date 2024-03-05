public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,55,6,55,70,100};

        System.out.println("Max: " + getMax(arr));
        System.out.println("Second Max: " + getSecondMax(arr));
        System.out.println("Min: " + getMin(arr));
        System.out.println("Second Min: " + getSecondMin(arr));
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
}
