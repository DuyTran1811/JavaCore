import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        boolean swapped = true;
        for (int i = 0; i < n -1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If there are no elements to swapp 
            // inside the loop then Break
            if (swapped == false) break;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };
        int n = arr.length;
        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, n);
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(arr));
    }
}
