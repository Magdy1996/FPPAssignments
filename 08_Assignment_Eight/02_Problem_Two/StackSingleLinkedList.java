public class StackSingleLinkedList implements Stack {

    private Node top = null ;


    private static class Node{
        Object date ;
        Node next ;

        Node(Object data ){
            this.date =data;
        }
    }
    @Override
    public void push(Object item) {
        if(item == null)
            return ;
        Node newNode = new Node(item);
        newNode.next = top ;
        top = newNode;
    }

    @Override
    public Object pop() {
        Object result = peek();
        if (result != null)
            top= top.next;
        return result;
    }

    @Override
    public Object peek() {
        if(top== null)
            return null;
        return top.date ;
    }

    @Override
    public int size() {
        int size = 0 ;
        Node current = top;
        while (current!= null){
            size++;
            current= current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null ;
    }


    @Override
    public String toString(){
        if(top == null)
            return null;
        Node current = top ;
        StringBuilder sb = new StringBuilder();
        while (current!= null){
            sb.append(current.date).append(" ");
            current= current.next;
        }
        return sb.toString();
    }
}
