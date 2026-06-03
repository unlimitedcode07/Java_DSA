//
//Search in a sorted Matrix
//Difficulty: MediumAccuracy: 56.27%Submissions: 149K+Points: 4
//Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
//Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.
//
//Examples:
//
//Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
//Output: true
//Explanation: 14 is present in the matrix, so output is true.
//Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
//Output: false
//Explanation: 42 is not present in the matrix.
//Input: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
//Output: true
//Explanation: 101 is present in the matrix.
//        Constraints:
//        1 ≤ n, m ≤ 1000
//        1 ≤ mat[i][j] ≤ 109
//        1 ≤ x ≤ 109


public class p10 {
    public static boolean searchMatrix(int[][] matrix, int target) {
         int row = matrix.length, col = matrix[0].length;
         int i = 0 , j = row*col-1;
         while(i<=j){
             int mid1 = i+ (j-i)/2;
             int r = mid1/col; // ak ro me kitne element hai
             int c = mid1%col; // konse col pe
             System.out.println("r:"+r+" c:"+c+" mid:"+mid1+" posi:"+matrix[r][c]+" i:"+i+" j:"+j);
             if(matrix[r][c] == target){
                 return true;
             } else if(matrix[r][c] > target){
                 j = mid1-1;
             }else{
                 i = mid1 +1;
             }

         }
         return false;
    }
    public static void main(String[] args) {
     //  int[][] arr = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
      int[][] arr = {{1,1}}; ;
       int target = 5;

        System.out.println(searchMatrix(arr,target));
    }
}
