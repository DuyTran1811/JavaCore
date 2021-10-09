public class BinarySearch {
    // Returns the index of x if it is in arr [l..r]
    // Otherwise Returns -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is centered
            if (arr[mid] == x) return mid;

            // If the element is less than the middle, then is can only 
            // Present in the left subarray
            if (arr[mid] > x) 
                return binarySearch(arr, l,  mid - 1, x);
            // Otherwise, the element can only be Present
            // In the right subarray 

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
       BinarySearch bs = new BinarySearch();
       int arr[] = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
       int n = arr.length;
       int x = 10;
       int result = bs.binarySearch(arr, 0, n - 1, x);
       if (result == -1)
           System.out.println("Element does not exist. ");
       else
           System.out.println("Element found at position: " + result);
    }
}
