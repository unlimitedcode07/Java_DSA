import java.util.PriorityQueue;

public class p3 {
    //Nearly sorted
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> q= new PriorityQueue<>();
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            q.add(arr[i]);
            if(q.size()>k)arr[j++] = q.remove();
        }
        while(arr.length-1 !=j-1)arr[j++] = q.remove();
    }
    public static void main(String[] args) {

    }
}
