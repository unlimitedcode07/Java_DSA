
//Square Root
//Difficulty: EasyAccuracy: 54.03%Submissions: 355K+Points: 2Average Time: 20m
//Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
//
//Floor value of any number is the greatest Integer which is less than or equal to that number.
//
//Examples:
//
//Input: n = 4
//Output: 2
//Explanation: Since, 4 is a perfect square, so its square root is 2.
//Input: n = 11
//Output: 3
//Explanation: Since, 11 is not a perfect square, floor of square root of 11 is 3.
//Input: n = 1
//Output: 1
//Explanation: 1 is a perfect sqaure, so its square root is 1.
//Constraints:
//        1 ≤ n ≤ 3*104



//t.c =0(rootn)   kyu ki kuch bhi karke ye root tak pohoch tehi brek hoga
public class p6 {
    public static int root(int n){
        int ans = 1;
        for(int i = 0; i<n; i++){
           if(i*i >= n){
               return ans;
           }
           ans = i;
        }
        return n;
    }
    public static void main(String[] args) {
       int n = 11;
        System.out.println(root(n));
         //3
    }
}
