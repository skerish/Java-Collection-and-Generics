package linkedList;

public class DoublyLinkedList {

    private static class Node{

        private int data;
        private Node prev;
        private Node next;

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private int size = 0;                                     // Initial state
    private Node head = null;
    private Node tail = null;

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("[");
        Node temp = this.head;
        while (temp != null){
            response.append(temp.data);
            temp = temp.next;
        }
        response.append("]");
        return response.toString();
    }


    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        System.out.println(linkedList);

    }

}
