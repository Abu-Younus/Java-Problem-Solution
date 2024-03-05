public class OddAndEven {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,55,6,55,70,100};

        System.out.println("Odd : " + getOdd(arr));
        System.out.println("Even : " + getEven(arr));
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
}
