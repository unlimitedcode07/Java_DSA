public class p21 {
    private static void printnthlvl(Node a, int lvl,int c) {
        if(lvl<c || a == null){
            return ;
        }
        if(lvl == c) System.out.print(a.val+" ");
        printnthlvl(a.left, lvl, c+1);
        printnthlvl(a.right, lvl, c+1);
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

        printnthlvl(a,2,0); //4 5 6 7
    }


}
