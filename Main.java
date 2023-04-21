public class Main {
    // Test case for merge sort algorithm.
    public static void main(String[]args){
        
     int[] arr = {4, 1, 8, 3, 5};
        
     MergeSort mergeSort = new MergeSort();
        
     mergeSort.sort(arr);
        
   for(int i=0;i<5;i++){
    System.out.print(arr[i] );

   }


 }
}
