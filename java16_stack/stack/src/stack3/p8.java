package stack3;

import java.util.Stack;

public class p8 {
   static class Solution {
        public int celebrity(int mat[][]) {
            int p = mat.length-1;
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i<=p; i++){
                st.push(i);
            }

            int t1 ; int t2 ;
            while(st.size() > 1){

                t1 = st.pop();
                t2 = st.pop();

                if(mat[t1][t2] == 1){
                    st.push(t2);
                }else{
                    st.push(t1);
                }
            }

            if(st.size() == 0) return -1;
            else{
                int c = st.pop();
                for(int i = 0; i<mat[0].length; i++){
                    if(c == i) continue;

                    if(mat[c][i] != 0 || mat[i][c] != 1){
                        return -1;
                    }
                }
                return c;
            }

        }
    }
    public static void main(String[] args) {
       int[][] mat = {{1, 1, 0}, {0, 1, 0},{0, 1, 1}};
       Solution kp = new Solution();
        System.out.println(kp.celebrity(mat));
    }
}
//
//The Celebrity Problem
//Difficulty: MediumAccuracy: 38.33%Submissions: 377K+Points: 4Average Time: 30m
//A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people. A square matrix mat[][] of size n*n is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.
//
//Note: Follow 0-based indexing.
//
//Examples:
//
//Input: mat[][] = [[1, 1, 0],
//        [0, 1, 0],
//        [0, 1, 1]]
//Output: 1
//Explanation: 0th and 2nd person both know 1st person and 1st person does not know anyone. Therefore, 1 is the celebrity person.
//Input: mat[][] = [[1, 1],
//        [1, 1]]
//Output: -1
//Explanation: Since both the people at the party know each other. Hence none of them is a celebrity person.
//Input: mat[][] = [[1]]
//Output: 0
//Constraints:
//        1 ≤ mat.size() ≤ 1000
//        0 ≤ mat[i][j] ≤ 1
//mat[i][i] = 1