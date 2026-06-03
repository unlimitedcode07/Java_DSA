package stack1;

import java.util.Stack;

public class p5 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st);
        //[10, 20, 30, 40]
        revers(st);
        System.out.println(st);
        //[40, 30, 20, 10]
    }

    private static void revers(Stack<Integer> st) {
        if(st.size() <= 1) return;
        int a = st.pop();
        revers(st);
        addatbotttom(a, st);
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
