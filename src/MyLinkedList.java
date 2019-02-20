public class MyLinkedList {

    private Basic1 head;
    private Basic1 tail;
    private int CurrentSize;

    public Basic1 getHead() {
        return head;
    }

    public void setHead(Basic1 head) {
        this.head = head;
    }

    public Basic1 getTail() {
        return tail;
    }

    public void setTail(Basic1 tail) {
        this.tail = tail;
    }

    public int getGetCurrentSize() {
        return CurrentSize;
    }

    public void setGetCurrentSize(int getCurrentSize) {
        this.CurrentSize = getCurrentSize;
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        CurrentSize = 0;
    }

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        Basic1 node = new Basic1(10, null);

    }

}
