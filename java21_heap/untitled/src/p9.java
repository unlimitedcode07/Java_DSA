// Find K Closest Elements
import java.util.*;
public class p9 {
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(
                    (a,b)->{
                        int kp = Math.abs(x-a);
                        int td = Math.abs(x-b);

                        if(kp != td) return td - kp;
                        return b- a;
                    }
            );
            for(int i : arr){
                pq.offer(i);
                if(pq.size()>k) pq.poll();
            }

            List<Integer> ans = new ArrayList<>();
            while(!pq.isEmpty()) ans.add(pq.poll());
            Collections.sort(ans);
            return ans;
        }
    }
    public static void main(String[] args) {

    }
}
