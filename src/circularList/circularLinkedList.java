package circularList;

public class circularLinkedList {

    int size = 0;
    Node head = null;
    Node tail = null;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void print(){
        Node temp = head;
        do {
            System.out.println(" " + temp.data);
            temp = temp.next;
        }while (temp!=null);
        System.out.println("");
    }

    public void addNodeToHead(int data){
        Node n = new Node(data);
        if (size==0){
            head = n;
            tail = n;
            n.next = head;
        }
        else {
            Node temp = head;
            n.next = temp;
            head = n;
            temp.next = head;
        }
    }



}
