import java.util.Arrays;

class BubbleSort {
    // bubble sort algorithm to sort an array in ascending order
    public static void bubbleSort(int arr[]) {
        boolean sorted = true;
        // iterate through the array to be sorted
        for (int i = 0; i < arr.length - 1; i++) {
            // if an element is greater than the next element, swap them
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                // set sorted to false, indicating that a swap occurred
                sorted = false;
            }
        }
        // if a swap occurred during the iteration, recursively call bubbleSort on the array again
        if (sorted == false) {
            bubbleSort(arr);
        }
    }

    public static void main(String[] args) {
        // an unsorted integer array
        int[] arr = {21, 31, 8, 4, 32};
        // print the array before sorting
        System.out.println("Before sorting: " + Arrays.toString(arr));
        // sort the array using bubble sort algorithm
        BubbleSort.bubbleSort(arr);
        // print the array after sorting
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
