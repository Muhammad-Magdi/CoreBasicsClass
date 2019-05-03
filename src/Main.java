import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MonotonicStack<Integer> st = new MonotonicStack<>();
        st.push(7);
        st.push(2);
        st.push(1);
        st.push(6);
        System.out.println(st.getMax());
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMax());
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMax());
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMax());
        System.out.println(st.getMin());
    }
}