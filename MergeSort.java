public class MergeSort {
     
    // The main function that calls mergeSort to sort the given array.
    // It checks if the array is empty or null before proceeding.
     
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }
     
    // Merge sort function that divides the array into atomic parts 
    // and recursively sorts them by calling itself.
    // It then merges the sorted subarrays using the merge() function.
     
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // The merge function that merges two sorted subarrays into a single sorted subarray.
    // It creates two subarrays from the given array by dividing it at the midpoint.
    // It then iterates over both subarrays, compares the elements and adds the smaller element to the result array.
    // Finally, it adds the remaining elements to the result array, if any.
     
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Create two subarrays from the original array by dividing it at the midpoint
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Merge the two subarrays by comparing the elements and adding the smaller element to the result array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Add the remaining elements to the result array, if any
         
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
