package stack2;

import java.util.Stack;

class Node {
    int val ;
    Node next = null;
    Node(int val){
        this.val = val;
    }
}

class MyStack{
    Node head;
    int length;
    int peek(){
       return head.val;
    }
    int pop(){
        if(head == null) return -1;
        int x = head.val;
        head = head.next;
        length--;
        return x;
    }
    void push(int val){
        Node kp = new Node(val);
        if(head == null) head = kp;
        else{
            kp.next = head;
            head = kp;
        }
        length++;
    }
    int size(){
        return length;
    }
    void display(){
     Node temp = head;
     while(temp!=null){
         System.out.println(temp.val);
         temp = temp.next;
     }
        System.out.println();
    }
}
class stack {
    public static void main(String[] args) {
        MyStack no = new MyStack();

        no.push(10);
        no.push(20);
        no.push(30);
        no.push(40);

        no.display();
//        40
//        30
//        20
//        10
    }
}