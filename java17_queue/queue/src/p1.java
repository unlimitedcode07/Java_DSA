import java.util.LinkedList;
import java.util.Queue;

public class p1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        // [10, 20, 30, 40]
        System.out.println(q.peek()); //10
        System.out.println(q.remove()); //10
        System.out.println(q);//[20, 30, 40]
    }
}
