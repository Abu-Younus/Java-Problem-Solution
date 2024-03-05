//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,55,6,55,70,100};
        System.out.println("Duplicate element in array is: " + getDuplicateElement(arr));
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
}