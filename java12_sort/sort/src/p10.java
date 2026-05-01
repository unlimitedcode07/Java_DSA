//geeksforgeeks
//search icon
//Courses
//        Tutorials
//Practice
//        Jobs
//My Profile
//
//
//Change Language
//
//
//
//Count Inversions
//Difficulty: MediumAccuracy: 16.93%Submissions: 769K+Points: 4
//Given an array of integers arr[]. You have to find the Inversion Count of the array.
//Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
//
//Examples:
//
//Input: arr[] = [2, 4, 1, 3, 5]
//Output: 3
//Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
//Input: arr[] = [2, 3, 4, 5, 6]
//Output: 0
//Explanation: As the sequence is already sorted so there is no inversion count.
//Input: arr[] = [10, 10, 10]
//Output: 0
//Explanation: As all the elements of array are same, so there is no inversion count.
//        Constraints:
//        1 ≤ arr.size() ≤ 105
//        1 ≤ arr[i] ≤ 104


public class p10 {
    static int inversionCount(int arr[]) {
        // Code Here
        int count = 0;
        for(int i = 0; i<arr.length; i++){
           count = op(count,arr,i);
        }
        return count;

    }

    private static int op(int count, int[] arr, int i) {
        for(int j = i+1; j<arr.length; j++){
            if(arr[i]>arr[j]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }
}
/// see optimal at p11