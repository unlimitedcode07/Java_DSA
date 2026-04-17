//
//Binary Search using recursion
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//Example 2:
//
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
//
//


public class p20 {
    public static int tow(int lo,int hi,int[] arr,int t){
        if(lo>hi) return -1;
        int mid = lo+(hi-lo)/2;
        if(arr[mid] == t) return mid;
        else if(arr[mid]<t) return tow(mid+1,hi,arr,t);
        else return tow(lo,mid-1,arr,t);

    }
    public static int check(int[] nums, int t){
        int n = nums.length-1;
        return tow(0,n-1,nums,t);
    }
    public static void main(String[] args) {
      int arr[] = {-1,0,3,5,9,12};
      int target = 9;
        System.out.println(check(arr,target)); //4
    }
}
