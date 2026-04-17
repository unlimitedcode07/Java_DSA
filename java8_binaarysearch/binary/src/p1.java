//binary search
//tc = O(logn)
//  eg
// arr = [2,3,4,5,6,7,8,9]
//              |   | |
// if we have to see in sorted arr that if 8 is in the arry
//then we check at half compar 5 with target 8 its smaller so go right half
//which is 7 go right again and we got 8

//Given a sorted array arr[] and an integer k, find the position(0-based indexing) at
//which k is present in the array using binary search. If k doesn't exist in arr[] return -1.
//
//Note: If multiple occurrences are there, please return the smallest index.
//
//        Examples:
//
//Input: arr[] = [1, 2, 3, 4, 5], k = 4
//Output: 3
//Explanation: 4 appears at index 3.
//Input: arr[] = [11, 22, 33, 44, 55], k = 445
//Output: -1
//Explanation: 445
//
// is not present.
//        Input: arr[] = [1, 1, 1, 1, 2], k = 1
//Output: 0
//Explanation: 1 appears at index 0.

public class p1 {
    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){

            int mid = (i + j)/2;

            if(nums[mid] == target) return mid;

           else if(nums[mid] > target){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr = {-1,0,3,5,9,12};


       int target = 1;
        System.out.println(search(arr,target));

    }
}






















