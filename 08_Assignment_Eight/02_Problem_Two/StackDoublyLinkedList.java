public class StackDoublyLinkedList implements Stack {

    private Node top = null ;

    private static class Node{
        Object data ;
        Node next ;
        Node previous;
        Node(Object item){
            this.data  = item;
        }
    }
    @Override
    public void push(Object item) {
        if(item == null)
            return ;
        Node newNode = new Node(item);
        newNode.next = top ;
        if(top != null)
            top.previous = newNode;

        top = newNode ;
    }

    @Override
    public Object pop() {
        Object result = peek();
        if(result != null){
            top = top.next;
            if(top!= null)
                top.previous= null;
        }
        return result;
    }

    @Override
    public Object peek() {
        return (top == null ? null : top.data);
    }

    @Override
    public int size() {
        int size = 0 ;
        Node current = top ;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
       return (top ==null);
    }
    @Override
    public String toString(){
        if(top==null)
                return "Empty stack ";
        Node current = top;
        StringBuilder sb = new StringBuilder();
        while (current!= null){
            sb.append(current.data).append(" ");
            current =current.next;
        }

        return sb.toString();
    }
}
