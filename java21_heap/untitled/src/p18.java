import java.util.List;
import java.util.PriorityQueue;

public class p18 {
    class minHeap implements Comparable< minHeap>{
        int[] arr = new int[2];
        int val;
        minHeap(int[] arr,int val){
            this.arr = arr;
            this.val = val;
        }
        public int compareTo(minHeap k){
            return this.val-k.val;
        }
    }
    class maxHeap implements Comparable< maxHeap>{
        int[] arr = new int[2];
        int val;
        maxHeap(int[] arr,int val){
            this.arr = arr;
            this.val = val;
        }
        public int compareTo(maxHeap k){
            return k.val-this.val;
        }
    }

    class ansHeap implements Comparable< ansHeap>{
        int[] arr = new int[2];
        int val;
        ansHeap(int[] arr,int val){
            this.arr = arr;
            this.val = val;
        }
        public int compareTo(ansHeap k){
            return this.val-k.val;
        }
    }


    class Solution {
        public int[] smallestRange(List<List<Integer>> nums) {
            PriorityQueue<minHeap> min = new PriorityQueue<>();
            PriorityQueue<maxHeap> max = new PriorityQueue<>();
            PriorityQueue<ansHeap> ans = new PriorityQueue<>();
            int j = 0;
            for(int i = 0; i<nums.size(); i++){
                int a = nums.get(i).get(j);
                int[] arr = {i,j};
                min.add(new minHeap(arr,a));
                max.add(new maxHeap(arr,a));
            }
            while(true){
                int[] ok = {min.peek().val,max.peek().val};// this is for ans object to store the dist and val
                int val = ok[1]-ok[0];//  this as well
                int[] op = {min.peek().arr[0],min.peek().arr[1]}; // position of privious min

                ans.add(new ansHeap(ok,val));
                if(nums.get(op[0]).size() <= op[1]+1) break;
                min.remove();
                int[] jk = {op[0],op[1]+1};
                min.add(new minHeap(jk,nums.get(jk[0]).get(jk[1])));
                max.add(new maxHeap(jk,nums.get(jk[0]).get(jk[1])));
            }
            return ans.peek().arr;

        }
    }
    public static void main(String[] args) {

    }
}
