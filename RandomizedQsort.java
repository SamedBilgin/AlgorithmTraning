import java.util.*;

public class RandomizedQsort {
    // This method chooses a random pivot and swaps it with the element at the end
    static void random(int arr[], int low, int high) {
        Random rand = new Random();
        int pivot = rand.nextInt(high - low) + low;
        int temp1 = arr[pivot];
        arr[pivot] = arr[high];
        arr[high] = temp1;
    }

    // This method partitions the array using the pivot element
    static int partition(int arr[], int low, int high) {
        // Choose a random pivot element and swap it with the element at the end
        random(arr, low, high);

        // Set the pivot element to the element at the end of the array
        int pivot = arr[high];

        // Initialize the partition index
        int i = (low - 1);

        // Traverse the array and move all elements smaller than the pivot to the left
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Move the pivot element to its correct position in the array
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of the pivot element
        return i + 1;
    }

    // This method recursively sorts the array using quicksort
    static void sort(int arr[], int low, int high) {
        if (low < high) {
            // Partition the array around the pivot element
            int pi = partition(arr, low, high);

            // Recursively sort the subarrays before and after the pivot element
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // This method prints the elements of the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Main method to test the code
    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        // Sort the array using quicksort
        sort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted array");
        printArray(arr);
    }
}
