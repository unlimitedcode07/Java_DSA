
//Move Zeroes
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]




public class p6 {
    public static void main(String[] args) {
        int[] arr = {9,1,0,3,12};
        int k = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[k] = temp;
                arr[i] = 0;
                k++;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
            //1 3 12 0 0
        }
    }
}
