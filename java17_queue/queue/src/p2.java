import java.util.LinkedList;
import java.util.Queue;

public class p2 {
    //queue traversal
    public static void display(Queue<Integer> q){
        for(int i = 0; i<q.size(); i++){
            int a = q.remove();
            System.out.print(a+" ");
            q.add(a);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

       display(q);//10 20 30 40
       addAtIdx(2,78,q);
       display(q);//10 20 78 30 40
       deleteAtIdx(2,q);
       display(q);//10 20 30 40

    }

    private static void deleteAtIdx(int idx, Queue<Integer> q) {
        for(int i = 0; i<q.size()+1; i++){
            int a = q.remove();
            if(idx != i) q.add(a);
        }
        System.out.println();
    }

    private static void addAtIdx(int idx, int val,Queue<Integer> q) {
        for(int i = 0; i<q.size()-1; i++){
            int a = q.remove();
            if(idx == i) q.add(val);
            q.add(a);
            System.out.println(q);
        }
        System.out.println();
    }
}
