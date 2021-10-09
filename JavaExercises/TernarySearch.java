import java.util.Arrays;

public class TernarySearch {
    public static int ternarySearch(int l, int r, int key, int arr[]) {
        if (r >= l) {
            // Find the mid1 and mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            // Check if key is present at any mid
            if (arr[mid1] == key) return mid1;
            if (arr[mid2] == key) return mid2;

            // Since key is not present at mind,
            // Check int which region it is present
            // Then repeat the Search operation
            // In that region

            if (key < arr[mid1]) {
                // The key lies in between l and mid1
                return ternarySearch(l, mid1 -1, key, arr);
            } else if (key > arr[mid2]) {
                // The key lies in between mid2 and r
                return ternarySearch(mid2 + 1, r, key, arr);
            } else {
                return ternarySearch(mid1 + 1, mid2 -1, key, arr);
            }
        }
        // Key not found
        return -1;
    }
    public static void main(String[] args) {
        int l, r, p, key;
        // Get the array
        // Sort the array if not sorted
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Starting index
        l = 0;
        // length of array
        r = 9;
        // Check for 5
        // Key to be searched in the array
        key = 5;
        // Search the key using ternarySearch
        p = ternarySearch(l, r, key, arr);
        // Print the result
        System.out.println(Arrays.toString(arr));
        System.out.println("Index of " + key + " is " + p);
        // Checking for 50
        // Key to be search in the array
        key = 50;
        // Search the key using ternarySearch
        p = ternarySearch(l, r, key, arr);
        // Print the result 
        System.out.println("Index of " + key + " is " + p);
    }
}
