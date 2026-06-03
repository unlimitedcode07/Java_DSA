public class Node{
    public int val;
    public Node right;
    public Node left;

    public Node(int val){
        this.val = val;
    }
    public void display(Node a){
       if(a == null){
           return;
       }
        System.out.print(a.val+" ");
       display(a.left);
       display(a.right);
    }
}
