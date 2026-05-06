package linkdlist2;

class Node{
  int val;
  Node next;


    Node(int val){
      this.val = val;
  }
}
class linkdlist{  // user define data structure
   Node head; // default null
   Node tail; // default null

    void addlist(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        //this will try to add first node cause at start tail and head are null
        else{
            // from 2nd node
            tail.next = temp;
            tail = temp;
        }
    }
   void displayR(){
        if(head == null) return ;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }
       System.out.println("null");
       System.out.println();
   }

    public void addhead(int i) {
        Node temp = new Node(i);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }

    }

    public void deleteAtSt() {
        if(tail == null) {
            System.out.println("list is empty");
            return;
        }
            Node temp = head.next;
            head = temp;
            // or head = head.next {easy}
        if(temp == null) tail = null;
    }
}
//  h = head
//     h      tail
//     10->20->30
// -----------------------------------------------
//   new node create 40
//   Node t = new Node(40)
//  ----------------------------------------------------------
//     h      tail
//     10->20->30->40
//                  t
//
//     tail.next = t
// ------------------------------------------------------
//     h           tail
//     10->20->30->40
//                  t
//     tail = t



public class p1 {
    public static void main(String[] args) {
        linkdlist a = new linkdlist();
        a.addlist(3);
        a.addlist(4);
        a.addlist(5);
        a.addlist(6);

        a.displayR();
        //3 ->4 ->5 ->6 ->null
        a.addhead(90);
        a.displayR();
        //90 ->3 ->4 ->5 ->6 ->null
        a.addhead(87);
        a.displayR();
        //87 ->90 ->3 ->4 ->5 ->6 ->null
        a.deleteAtSt();
        a.displayR();
        //90 ->3 ->4 ->5 ->6 ->null
    }
}
