import java.util.*;

public class p1 {
    public static void main(String[] args) {
        // minheap
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(20);
        p.add(50);
        p.add(-45);
        System.out.println(p.peek());//-45
        System.out.println(p);// [-45, 50, 20]
        p.remove();
        System.out.println(p);// [20, 50]
        p.add(2);
        p.add(5);
        p.add(-45);
        p.add(0);
        p.add(80);
        p.add(-9);
        System.out.println(p);
        //[-45, -9, 0, 2, 5, 20, 80, 50]
        //                       /\
        //                       ||
        //                    this si not increases
        //                this si order level printing
        //               where first is min
    }
}
