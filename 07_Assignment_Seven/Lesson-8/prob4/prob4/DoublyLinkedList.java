package prob4;

public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item) {
        Node newNode = new Node();
        newNode.value = item;
        if (header.next == null) {
            header.next = newNode;
            newNode.previous = header;
            return;
        }
        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
    }



    // 2. Remove by passing object
    public boolean remove(String item){

        // if the list is empty
        if(header== null)
            return false ;

        Node current = header ;
        while ( current != null  && current.value !=item ){
            current= current.next;
        }

        // if the item is not found
        if(current == null)
            return  false;

        // if item is the first one
        if(header == current){
            header = current.next;
            header.previous = null ;
            return true;
        }
        // if the item is not the first and not the last
        if(current.next != null){
            current.next.previous= current.previous;
            current.previous.next= current.next;
        }
        // the item is the last one
        else {
            current.previous.next = null;
        }
         return  true;
    }


    // 3. Remove the First Node

    public boolean removeFirst() {
        if (header.next == null) {
            return false;
        }

        Node firstNode = header.next;
        if (firstNode.next == null) {
            header.next = null;
        } else {
            header.next = firstNode.next;
            firstNode.next.previous = header;
        }
        return true;
    }



    // 4. Prints the list from last to first
    public void printReverse() {


        if(header.next == null){
            System.out.println("List is empty");
            return;
        }
        Node current = header.next;
        while (current.next != null){
            current= current.next;
        }
        System.out.print("[");
        while (current != header) {
            System.out.print(current.value );
            if(current.previous != header)
                System.out.print(" ");
            current = current.previous;
        }
        System.out.print("]");
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        list.addLast("Magdy");
        list.addLast("Mark");
        list.addLast("Sai");
        list.addLast("Cuong");
        System.out.println(list);
        list.remove("Sai");
        list.remove("Mark");
        list.remove("afdskjlad");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.printReverse();

        // Call all your implemented Methods
    }
}
