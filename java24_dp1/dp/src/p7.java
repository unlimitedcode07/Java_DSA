public class p7 {

    //  Unique Paths   using dp 
     // p=> 8 this can be don using double for loop as well

        static int op(int m, int n, int[][] dp, int min){
            if(m == -1 || n == -1) return 0;
            if(m == 0 && n == 0) return 1;
            if(dp[m][n] != 0) return dp[m][n];
            int ans = op(m-1,n,dp,min) + op(m,n-1,dp,min);
            dp[m][n] = ans;
            if(min>=n &&min>=m) dp[n][m] = ans;
            return ans;
        }
        public static int uniquePaths(int m, int n) {
            int min = Math.min(m-1,n-1);
            int[][] dp = new int[m][n];
            return op(m-1,n-1,dp,min);
        }
    public static void main(String[] args) {
        System.out.println(uniquePaths(4,3));// 10
    }
}
