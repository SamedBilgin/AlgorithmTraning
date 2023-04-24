public class LinearSearch {
    // Method to search for an element in an array
    public static int linearSearch(int arr[], int x) {
        // Get the length of the array
        int n = arr.length;
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // If the current element matches the search value,
            // return the index of that element
            if (arr[i] == x) {
                return i;
            }
        }
        // If the search value is not found in the array,
        // return -1
        return -1;
    }

    public static void main(String args[]) {
        // Example array to search through
        int arr[] = {7, 9, 2, 10, 41};
        // Value to search for
        int x = 10;

        // Call the linearSearch method with the example array and search value
        int result = linearSearch(arr, x);

        // If the search method returns -1, the value was not found in the array
        if (result == -1) {
            System.out.println("Element is not present in array");
        }
        // Otherwise, print the index of the first occurrence of the search value
        else {
            System.out.println("Element is present at index " + result);
        }
    }
}
