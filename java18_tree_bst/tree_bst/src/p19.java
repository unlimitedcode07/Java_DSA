import java.util.LinkedList;
import java.util.Queue;
// proper level vise printing
class pair{
    Node node;
    int level;



    public pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
public class p19 {

    static void levelorder(Node a){
       Queue <pair> q = new LinkedList<>();
        System.out.println();
       q.add(new pair(a,0));
       int count = 0;
       while(q.size()>0){
           pair f = q.remove();
           if(f.level >count){
             count++;
               System.out.println();
           }
           System.out.print(f.node.val+" ");
           if(f.node.left!=null)q.add(new pair(f.node.left,f.level+1));
           if(f.node.right!=null)q.add(new pair(f.node.right,f.level+1));
       }
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

    }
}

