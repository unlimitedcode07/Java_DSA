// size of binary tree size()
// sum of nods of binary tree sum()
// muximum val in bt
// level of tree
public class p4 {
    static class d{
        static int size(Node a){
            if(a == null){
                return 0;
            }
            return 1+size(a.left)+size(a.right);
        }
        static int sum(Node a){
            if(a == null){
                return 0;
            }
            return a.val + sum(a.left)+sum(a.right);
        }
        static int maximum(Node a,int max){
            if(a == null){
                return 0;
            }
           int k =  maximum(a.left,max);
            int p =  maximum(a.right,max);
            int val =  Math.max(k,p);
             return Math.max(val, a.val);
        }
        static int level(Node a){
            if(a == null){
                return 0;
            }
            return 1 + Math.max(level(a.left),level(a.right));
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);

        Node b = new Node(2);
        Node c = new Node(31);

        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.right = c; a.left = b;
        b.right = e; b.left = d;
        c.right = g; c.left = f;

        d kp = new d();
        System.out.println(kp.size(a)); //7
        System.out.println(kp.sum(a)); //56
        System.out.println(kp.maximum(a,0)); //31
        System.out.println(kp.level(a));//3

    }
}

