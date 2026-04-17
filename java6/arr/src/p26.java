

// Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place).
// In other words, arrange the elements into a sequence
// such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions,
// find the lexicographically smallest one.
//
// Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array
// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [2, 1, 4, 3, 5]
// Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
// Input: arr[] = [2, 4, 7, 8, 9, 10]
// Output: [4, 2, 8, 7, 10, 9]
// Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.
// Input: arr[] = [1]
// Output: [1]

public class p26 {
    public static void wave(int[] arr){
        int n = arr.length;
        if(arr.length%2 != 0) n--;
        for(int i =0; i<n; i+=2){
            int x = arr[i];
            arr[i] =arr[i+1];
            arr[i+1] = x;
        }

    }
    public static void print(int[] arr) {
        for(int y : arr){
            System.out.print(y+" ");
        }
    }
    public static void main(String[] args) {
      int[] arr = { 1,2,3,4,5,6,7};
      wave(arr);
      print(arr);
      //2 1 4 3 6 5 7
    }
}
