// Unique Paths

// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

// Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

// The test cases are generated so that the answer will be less than or equal to 2 * 109.



// Example 1:


// Input: m = 3, n = 7
// Output: 28
// Example 2:

// Input: m = 3, n = 2
// Output: 3
// Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Down -> Down
// 2. Down -> Down -> Right
// 3. Down -> Right -> Down


// Constraints:

// 1 <= m, n <= 100


public class p18 {
    public static int uniquePaths(int m, int n){
        if(m == 1 || n== 1) return 1;
        return uniquePaths(m-1,n) + uniquePaths(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println( uniquePaths(3,5));
         // 15
        // not optimal
    }
}


//same but simple
//
//
//import java.util.*;
//
//public class practic {
//    public static void main(String[] args) {
//        System.out.println( uniquePaths(5,8));
//
//    }
//
//    public static int uniquePaths(int m, int n){
//        int i = 0;
//        int j = 0;
//        return ans(i,j,m,n);
//    }
//
//    public static int ans(int i,int j, int m, int n){
//        if(i == m || j == n){
//            return 0;
//        }
//        if(i == m-1 && j == n-1){
//            return 1;
//        }
//        return ans(i,j+1, m, n) +ans(i+1,j, m, n);
//    }
//}