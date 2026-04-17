//
//Single Among Doubles
//Difficulty: MediumAccuracy: 53.69%Submissions: 98K+Points: 4Average Time: 20m
//Given a sorted array arr[] of n positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.
//
//Examples :
//
//Input: n = 5, arr[] = {1, 1, 2, 5, 5}
//Output: 2
//Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
//        Input: n = 7, arr[] = {2, 2, 5, 5, 20, 30, 30}
//Output: 20
//Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.
//Expected Time Complexity: O( Log(n) ).
//Expected Auxiliary Space: O(1).
//
//Constraints
//0 <  n  <= 10^6
//        0 <= arr[i] <= 10^9

public class p8 {
    public static int single(int[] arr){
        int i = 0;
        int j = arr.length-1;
        if(arr.length == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[j] != arr[j-1]) return arr[j];
        int result = 0;
        while(i<=j) {
            System.out.println("howmany"+i+"ok"+j);
            int mid = i + (j - i) / 2;

            if(mid%2== 0){
                System.out.println("in the if"+mid);
                if(arr[mid-1] != arr[mid]){
                    System.out.println("in the if if"+mid);
                    i = mid+1;
                    result = arr[mid];
                }else{
                    System.out.println("in the if else"+mid);
                    j = mid-1;
                }
            }else{
                System.out.println("in the else"+mid);
                if(arr[mid-1] == arr[mid]){
                    System.out.println("in the else if"+mid);
                    result = arr[mid];
                    i=mid+1;
                }else{
                    System.out.println("in the else else"+mid);
                    j = mid -1;
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 4, 27, 27, 32, 32, 36, 36 ,41, 41 ,42 ,42 ,45};
        int[] arr1 = {0 ,0 ,17 ,34 ,34};
        System.out.println( single(arr1));
    }
}
