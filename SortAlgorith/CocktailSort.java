import java.util.Arrays;

public class CocktailSort {
    public static void cocktailSort(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length;
        while (swapped == true) {
            // reset the swapped flag on entering the
            // loop, because it might be true from 
            // previous iteration
            swapped = false;

            // loop from bootom to top same as
            // the bubble sort 
            for (int i = start; i < end -1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp  = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            // if nothing moved, then array is sorted.
            if (swapped == false) break;
            // otherwise, reset the swapped flag so that it 
            // can be used in the next stage 
            swapped = false;
            
            // move the end point back by one, because 
            // item at the end is in its reghtful spot
            end = end - 1;

            for (int i = end -1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                   int temp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = temp;
                   swapped = true;
                }
            }
            // increase the starting point, because 
            // the last stage would hava move the next 
            // samllest number to its righthful spot.
            start = start + 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8, 0, 2 };
        System.out.println(Arrays.toString(arr));
        cocktailSort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    }
}
