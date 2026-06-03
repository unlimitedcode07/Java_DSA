
public class p2 {
    static class d{
      static void preorder(Node a){
            if(a == null){
                return;
            }
            System.out.print(a.val+" ");
          preorder(a.left);
          preorder(a.right);
        }
        static void inorder(Node a){
            if(a == null){
                return;
            }
            inorder(a.left);
            System.out.print(a.val+" ");

            inorder(a.right);
        }
        static void postorder(Node a){
            if(a == null){
                return;
            }

            postorder(a.left);
            postorder(a.right);
            System.out.print(a.val+" ");
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

        a.right = c; a.left = b;
        b.right = e; b.left = d;
        c.right = g; c.left = f;


        //         1
        //       /   \
        //      2     3
        //    /  \   /  \
        //   4    5 6    7

        d kp = new d();

        kp.preorder(a);//1 2 4 5 3 6 7
        System.out.println();

        kp.inorder(a);//4 2 5 1 6 3 7
        System.out.println();

        kp.postorder(a);//4 5 2 6 7 3 1

    }
}

