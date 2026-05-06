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
   int size;


   void addlist(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        //this will try to add first node cause at start tail and head are null
        else{
            // from 2nd node
            tail.next = temp;
            tail = temp;
        }
        size++;
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

    void addhead(int i) {
        Node temp = new Node(i);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
  size++;
    }

    void deleteAtSt() {
        if(tail == null) {
            System.out.println("list is empty");
            return;
        }
            Node temp = head.next;
            head = temp;
            // or head = head.next {easy}
        if(temp == null) tail = null;
        size--;
    }
    boolean search(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }

    void insertAtAny(int idx, int val) {
        if(idx < 0 || idx > size){
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(val);

        // insert at head
        if(idx == 0){
            newNode.next = head;
            head = newNode;
            if(size == 0) tail = newNode;
        }
        else{
            Node temp = head;

            for(int i = 1; i < idx; i++){
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            // update tail if inserted at end
            if(idx == size){
                tail = newNode;
            }
        }

        size++;
    }

    void delete(int idx) {
        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return;
        }

        // delete head
        if(idx == 0){
            head = head.next;
            size--;

            // if list becomes empty
            if(size == 0){
                tail = null;
            }
            return;
        }

        Node temp = head;

        // reach (idx - 1)
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }

        // delete node
        temp.next = temp.next.next;

        // update tail if last element deleted
        if(idx == size - 1){
            tail = temp;
        }

        size--;
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
        System.out.println(a.size);
        //5
        System.out.println(a.search(6));
        // true
        a.insertAtAny(0,78);
        a.displayR();
        //78 ->90 ->3 ->4 ->5 ->6 ->null
        a.delete(0);
        a.displayR();
        //90 ->3 ->4 ->5 ->6 ->null
    }
}
