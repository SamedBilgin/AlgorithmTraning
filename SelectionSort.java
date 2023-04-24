import java.util.Arrays;

class SelectionSort {
    public static void selectionSort(int arr[]) {
        // iterate through the array from 0 to length - 1
        for (int i = 0; i < arr.length - 1; i++) {
            // find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the minimum element with the first element in the unsorted part of the array
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // an unsorted integer array
        int[] arr = { 1, 31, 8, 4, 32 };
        // print the array before sorting
        System.out.println("Before sorting: " + Arrays.toString(arr));
        // sort the array using selection sort algorithm
        SelectionSort.selectionSort(arr);
        // print the array after sorting
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
