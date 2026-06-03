
public class p1 {

    public static void main(String[] args) {
        Node a = new Node(1);

        Node b = new Node(2);
        Node c = new Node(3);

        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.right = c; a.left = b;
        b.right = e; b.left = d;
        c.right = g; c.left = f;


        //         1
        //       /   \
        //      2     3
        //    /  \   /  \
        //   4    5 6    7

        a.display(a);
        //1 2 4 5 3 6 7
//        Preorder Traversal
//        Root → Left → Right
    }
}
