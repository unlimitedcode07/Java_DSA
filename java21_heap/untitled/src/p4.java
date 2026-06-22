import java.util.PriorityQueue;

public class p4 {
    //Minimum Cost of ropes
    class Solution {
        public static int minCost(int[] arr) {
            PriorityQueue<Integer> q= new PriorityQueue<>();
            for(int i = 0 ; i<arr.length; i++) q.add(arr[i]);
            int sum = 0;
            while(q.size() != 1){
                int a = q.remove() + q.remove();
                sum = sum+a;
                q.add(a);
            }
            return sum;
        }
    }
    public static void main(String[] args) {

    }
}
