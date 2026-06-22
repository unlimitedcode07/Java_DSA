import java.util.Collections;
import java.util.PriorityQueue;
/// if in q you are given kth smalest then you will use max heap and for
/// kth largest use minheap
public class p2 {
    public static int kthsmalest(int[] arr, int k){
        //maxheap => p.peak contains max element
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int el : arr){
            p.add(el);
            if(p.size()>k) p.remove();
        }
        return p.peek();
    }

        public static int KthLargest(int arr[], int k) {
            PriorityQueue<Integer> p = new PriorityQueue<>();
            for(int el : arr){
                p.add(el);
                if(p.size()>k) p.remove();
            }
            return p.peek();


        }

    public static void main(String[] args) {


    }
}
