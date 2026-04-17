
//Arranging Coins
//Easy
//        Topics
//premium lock icon
//        Companies
//You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
//
//Given the integer n, return the number of complete rows of the staircase you will build.
//
//
//
//
//
//                ____
//                 |__|__
//Example 1:       |__|__|
//Input: n = 5     |__|__| x
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2.





//              ____
//              |__|___
//Example 2:    |__|__|__
//              |__|__|__|
//              |__|__| x  x
//Input: n = 8
//Output: 3
//Explanation: Because the 4th row is incomplete, we return 3.

public class p9 {
    public static void main(String[] args) {
        int n = 11;
        long i = 0;
        long j = n;
        long ans = 0;

        while (i <= j) {
            long mid = i + (j - i) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum == n) {
                ans = mid;
                break;
            } else if (sum > n) {
                j = mid - 1;   // ✅ FIX
            } else {
                ans = mid;    // ✅ FIX
                i = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
