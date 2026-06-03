import java.util.LinkedList;
import java.util.Queue;
///  this si level wise printing
public class p18 {
    static void levelorder(Node a){
      Queue <Node> q = new LinkedList<>();
      q.add(a) ;
      System.out.println();

      while(q.size()>0){
          Node f = q.remove();
          System.out.print(f.val+" ");
          if(f.left!=null) q.add(f.left);
          if(f.right!=null) q.add(f.right);
      }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);

        Node b = new Node(2);
        Node c = new Node(3);

        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node k = new Node(-1);

        a.right = c; a.left = b;
        b.right = e; b.left = d;
        c.right = g; c.left = f;
        e.left = k;

        //         1
        //       /   \
        //      2     3
        //    /  \   /  \
        //   4    5 6    7

        a.display(a);
        //1 2 4 5 3 6 7
        levelorder(a);
        // 1 2 3 4 5 6 7
    }
}
