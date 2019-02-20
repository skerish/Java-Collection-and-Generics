public class Basic1 {

    private int data;
    private Basic1 next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Basic1 getNext() {
        return next;
    }

    public void setNext(Basic1 next) {
        this.next = next;
    }

    public Basic1(int data, Basic1 next) {
        this.data = data;
        this.next = next;
    }

    public Basic1(int data) {
        this.data = data;
    }

    public Basic1(Basic1 next) {
        this.next = next;
    }
}
