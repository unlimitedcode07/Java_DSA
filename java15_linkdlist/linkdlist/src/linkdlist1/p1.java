package linkdlist1;

class Node{
    int val;
    Node next ;
    Node(int val){
        this.val = val;
    }
}

public class p1 {
    public static void main(String[] args) {
       Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        // a.next ki default null hai so we conect
        //connect karenge

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
// f ka default next null
        System.out.println(a.val);

        System.out.println(a.next.next.next.val);
           // a.next = b      b.next.next.val
           // b.next = c         c.next.val
           // c.next = d           d.val  = 40

        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
        // all are c
//        linkdlist.Node@5f184fc6
//        linkdlist.Node@5f184fc6
//        linkdlist.Node@5f184fc6
    }
}
