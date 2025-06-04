import Controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack();
        st.push(10);
        st.push(-1);
        st.push(5);
        st.push(8);

        System.out.println("Tamaño:" + st.size());
        st.printStack();
        st.pop();

        System.out.println("Tamaño:" + st.size());
        st.printStack();
    }
}
