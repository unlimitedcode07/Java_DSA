public class p14 {
   // conver tree to linked list preorder
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node i = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = i;

        op(a);
        while(a.right!=null){
            System.out.print(" "+a.data);
            a = a.right;
        }
        System.out.print(" "+a.data);
    }
// my version
    private static void op(Node root) {
        if(root == null) return;
        if(root.right == null && root.left == null) return ;
        Node r = root.right;
        if(root.left != null){
            root.right = root.left;
            root = root.right;
        }
        op(root);
        if(r != null){
            while(root.right != null) root = root.right;
            op(r);
            root.right = r;
        }

    }

    // alter  => stander version
    private static void flatten(Node root) {
        if(root == null) return;

        flatten(root.left);
        flatten(root.right);

        Node left = root.left;
        Node right = root.right;

        root.left = null;
        root.right = left;

        Node curr = root;
        while(curr.right != null) {
            curr = curr.right;
        }

        curr.right = right;
    }
}
