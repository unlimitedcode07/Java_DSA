package stack1;

import java.util.Stack;

public class p4 {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        addatbotttom(50,st);
        System.out.println(st);
        //[50, 10, 20, 30, 40]

    }

    private static void addatbotttom(int i, Stack<Integer> st) {
        if(st.size() == 0){
            st.push(i);
            return;
        }
        int a = st.pop();
        addatbotttom(i,st);
        st.push(a);
    }
}
