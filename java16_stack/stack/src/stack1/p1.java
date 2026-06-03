package stack1;

//stack is first in last out or last in first out data structure

import java.util.Stack;

public class p1 {
    public static void main(String[] args) {
        Stack <String> st = new Stack<>();
        st.push("kp");
        st.push("om");
        st.push("td");
        st.push("hp");
        System.out.println(st);
         // [kp, om, td, hp]  this is use AS = O(n);
        System.out.println(st.size());
        //4
        st.pop();
        System.out.println(st);
        //[kp, om, td]
        System.out.println(st.peek());// to see top mot element
        //td

        System.out.println(st.pop());  // it return the topmost element
        // thats why we can store it ;
        String s = st.pop();
        System.out.println(s);//om
        System.out.println(st); //[kp]
        st.pop();
        System.out.println(st.isEmpty()); //true
        //alter   System.out.println(st.size() == 0);
        System.out.println(st);//[]  stack is empty know

        // now if i do this know
        // st.pop()
        // it give error
        // reason => underflow
        // and there is no over flow in stack cause unlimited size
    }
}
