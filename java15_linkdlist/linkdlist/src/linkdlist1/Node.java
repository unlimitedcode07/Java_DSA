package linkdlist1;

public class Node{
    public int val;
    public Node next ;
    public Node(int val){
        this.val = val;
    }

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

}
