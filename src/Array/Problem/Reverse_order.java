package Array.Problem;

import java.util.Arrays;

public class Reverse_order{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
