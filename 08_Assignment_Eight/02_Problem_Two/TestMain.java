import javax.xml.transform.Source;

public class TestMain {
    public static void main(String[] args) {
        // Testing Stack using single linked list

        Stack stack = new StackSingleLinkedList();
        stack.push(10);
        stack.push("Magdy");
        stack.push("Single");
        stack.push("Merna");
        System.out.println(stack.toString());
        stack.pop();
        stack.push("Apple");
        stack.push("Banana");
        stack.push(12.12);
        System.out.println(stack.toString());
        System.out.println("The size is : " + stack.size());
        System.out.println("The peek is " + stack.peek());





        // Testing Stack using Doubly-linked list


        Stack st = new StackDoublyLinkedList();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println("Size = " + st.size());
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

    }
}
