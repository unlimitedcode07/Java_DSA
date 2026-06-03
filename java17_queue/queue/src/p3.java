import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class p3 {
    static class Solution {
        public void reverseQueue(Queue<Integer> q) {
            int n = q.size();
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i <n; i++){
                st.push(q.remove());
            }
            for(int i = 0; i <n; i++){
                q.add(st.pop());
            }
            System.out.println(q);
        }
    }
    public static void main(String[] args) {
     int[] a = {5, 10, 15, 20, 25};
     Queue<Integer> q = new LinkedList<>();
     for(int i = 0; i<a.length; i++){
         q.add(a[i]);
     }
     Solution kp = new Solution();
     kp.reverseQueue(q);
     //[25, 20, 15, 10, 5]
    }
}
//
//Queue Reversal
//Difficulty: EasyAccuracy: 77.98%Submissions: 165K+Points: 2
//Given a queue q containing integer elements, your task is to reverse the queue.
//
//        Examples:
//
//Input: q[] = [5, 10, 15, 20, 25]
//Output: [25, 20, 15, 10, 5]
//Explanation: After reversing the given elements of the queue, the resultant queue will be 25 20 15 10 5.
//Input: q[] = [1, 2, 3, 4, 5]
//Output: [5, 4, 3, 2, 1]
//Explanation: After reversing the given elements of the queue, the resultant queue will be 5 4 3 2 1.
//Constraints:
//        1 ≤ q.size() ≤ 103
//        0 ≤ q[i] ≤ 105