import java.util.Arrays;

public class ExponentialSearch {
    public static int exponentialSearch(int arr[], int n, int x) {
        // If x is present at firt location itself
        if (arr[0] == 0) return 0;
        // Fin range for binary search by 
        // repeated doubling
        int i = 1;
        while (i < n && arr[i] <= x) 
            i = i * 2;
           return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = exponentialSearch(arr, arr.length, x);
        System.out.println(Arrays.toString(arr));
        System.out.println((result < 0) ? "Element is not present in array" : "Element is present is present at index: " + result);
    }
}
