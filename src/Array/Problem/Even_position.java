package Array.Problem;

public class Even_position {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        System.out.println("Elements at odd positions:");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
