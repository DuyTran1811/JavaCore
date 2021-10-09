import java.util.Arrays;

public class JumpSearch {
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        // Finding block size to be jumped
        int step = (int) Math.floor(Math.sqrt(n));

        // Finding the block whrer element is
        // Present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) return -1;
        }
        // Doing a linear search for x in block
        // Beginning with prev.
        while (arr[prev] < x) {
            prev ++;

            // If we reached next block or end of
            // Array, element is not present.
            if (prev == Math.min(step, n)) return -1;
        }
        // If element is found
        if (arr[prev] == x)
            return prev;
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);
        System.out.println(Arrays.toString(arr));
        // Print the index where 'x' is located
        System.out.println("\n Number " + x + " is at index " + index);
    }
}
