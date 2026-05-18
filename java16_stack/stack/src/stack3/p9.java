package stack3;

import java.util.Stack;

public class p9 {
  static  class Solution {
          public int[] canSeePersonsCount(int[] heights) {
            Stack<Integer> st = new Stack<>();
            int n = heights.length;
            int[] ans = new int[n];
            ans[ans.length-1] = 0;
            st.push(heights[n-1]);
            int count = 0;
            for(int i = n-2; i>=0; i--){
                count = 0;
                while(st.size()>0 && heights[i]>st.peek()){
                    st.pop();
                    count++;
                }
                if(st.size()!=0) count++;
                st.push(heights[i]);
                ans[i] = count;
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int[] mat = {10,6,8,5,11,9};
        Solution kp = new Solution();
        System.out.println(kp.canSeePersonsCount(mat));
    }
}
