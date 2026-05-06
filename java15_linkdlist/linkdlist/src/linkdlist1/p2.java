package linkdlist1;
// display linkdlist
public class p2 {

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" --> ");
            if(temp.next == null){
                System.out.print("Null");
            }
            temp = temp.next;
        }

    }

    // this using recursive
    public static void recursive(Node  head){
        if(head == null) {
            System.out.print(" Null ");
            return;
        }
        System.out.print(head.val+" -> ");
        recursive(head.next);
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
        display(a);
        //10 --> 20 --> 30 --> 40 --> 50 --> 60 --> Null
        System.out.println();

        recursive(a);
        //10 -> 20 -> 30 -> 40 -> 50 -> 60 ->  Null
    }
}
