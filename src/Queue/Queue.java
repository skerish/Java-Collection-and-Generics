package Queue;

public class Queue {

    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear + 1)%5;
        size = size +1;
    }

    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5] + " ");
        }
        System.out.println("\n");
    }

    public void deQueue(){
        front = (front + 1)%5;
        size = size -1;
    }

    public static void main(String[] args) {

        Queue obj = new Queue();
        for (int i = 0; i < 5; i++) {
            obj.enQueue(5+i);
        }
        obj.show();
        obj.deQueue();
        obj.deQueue();
        obj.show();
        obj.enQueue(15);
        obj.enQueue(16);
        obj.show();
    }

}
