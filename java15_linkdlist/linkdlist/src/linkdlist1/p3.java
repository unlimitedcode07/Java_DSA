package linkdlist1;
// get nth index element  //index ing is 1 based
public class p3 {

    public static int display(Node head,int k){
       Node temp = head;
       for(int i = 1; i<k; i++){
           temp = temp.next;
        }
       return temp.val;
    }

    // this using recursive
    public static int recursive(Node  head,int k){
        if(k == 1) {
            return head.val;
        }
        if(head == null) {
            return -1;
        }
        return recursive(head.next,k-1);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(display(a,4));

        System.out.println(recursive(a,4));


    }
}
