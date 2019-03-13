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
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
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
        if(size == 0){
            System.out.println("List is empty!");
        }
        else{
            Node temp = head;
            do {
                System.out.println(" " + temp.data);
                temp = temp.next;
            }while (temp != head);
            System.out.println("");
        }
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
            tail.next = head;
        }
        size++;
    }

    public void addNodeToTail(int data){
        if (size == 0){
            addNodeToHead(data);
        }
        else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            tail.next = head;
            size++;
        }
    }

    public void deleteHead(){
        if(size != 0){
            Node temp = head;
            head = head.next;
            tail.next = head;
            size--;
        }
    }

    public static void main(String[] args) {
        circularLinkedList obj = new circularLinkedList();
        obj.print();
        for (int i = 0; i < 5; i++) {
            obj.addNodeToHead(i+1);
        }
        obj.print();
        obj.deleteHead();
        obj.print();
    }

}
