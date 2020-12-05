package oops.SOLID.lsp.stack.before;

public class StackMain {
    public static void main(String[] args) {
        StackWrong st = new StackWrong();
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.clear();
        System.out.println(st.top());
    }
}
