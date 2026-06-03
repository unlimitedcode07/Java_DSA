package linkdlist7q;

import linkdlist1.Node;
class Dnode{
    int val ;
    Dnode next;
    Dnode prv;
    Dnode(int val){
        this.val = val;
    }
}
class DLL{
    Dnode head;
    Dnode tail;
    int size;
    void insertAtHead(int val){
        Dnode temp = new Dnode(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prv = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        Dnode temp = new Dnode(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prv = tail;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head == null) return ;
        if(head.next == null) {
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prv = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(head == null) return ;
        if(head.next == null) {
            head = null;
            tail = null;
        }
        else{
            tail = tail.prv;
            tail.next = null;
        }
        size--;
    }
    void display(){
        Dnode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    void displayr(){
        Dnode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ->");
            temp = temp.prv;
        }
        System.out.print("null");
        System.out.println();
    }

    void insertat(int idx,int val){

        Dnode temp = new Dnode(val);
        int op = idx;
        if(op>size || op<0) return;

        if(op==0){
            temp.next = head;
            head.prv = temp;
            head = temp;
            size++;
            return;
        }
        if(op == size){
            tail.next = temp;
            temp.prv = tail;
            tail = temp;
            size++;
            return;
        }

        Dnode t1 = head;
        while(op>1){
            t1 = t1.next;
            op--;
        }
        Dnode t2 = t1.next;
        t1.next = temp;
        temp.next =t2;
        t2.prv = temp;
        temp.prv = t1;
        size++;
    }
}
public class p1 {
    public static void main(String[] args) {
       DLL list = new DLL();
       list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtTail(4);


        list.displayr();
        //4 ->1 ->2 ->3 ->null

        list.display();
        //3 ->2 ->1 ->4 ->null

        list.deleteAtHead();
        list.display();
        //2 ->1 ->4 ->null

        list.deleteAtTail();
        list.display();
        //2 ->1 ->null

        list.insertAtTail(5);
        list.insertAtTail(6);
        list.insertAtTail(7);
        list.display();
       // 2 ->1 ->5 ->6 ->7 ->null
        list.insertat(-9, 99);
        list.display();
        //2 ->1 ->5 ->6 ->7 ->99 ->null
    }
}
