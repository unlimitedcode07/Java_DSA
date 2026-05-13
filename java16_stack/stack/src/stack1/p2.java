package stack1;

import java.util.Stack;

//traversing the stack;
public class p2 {
    public static void main(String[] args) {
        Stack <Integer> no = new Stack<>();
        Stack <Integer> kp = new Stack<>();

        no.push(10);
        no.push(20);
        no.push(30);
        no.push(40);
        no.push(50);
        no.push(60);

        while(no.size()>0){
            int n = no.pop();
            System.out.print(n+" ");
            kp.push(n);
        }
        //60 50 40 30 20 10
        System.out.println();
        while(kp.size()>0){
            int n = kp.pop();
            System.out.print(n+" ");
            no.push(n);
        }
        //10 20 30 40 50 60
    }
}
