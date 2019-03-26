package Stack;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top;

    public void push(int data){
        if (top >= capacity){
            expand();
        }
        stack[top] = data;
        top++;
    }

    public void pop(){
        if (top == 0){
            System.out.println("Stack is empty!");
        }
        else{
            top--;
            System.out.println("pop: " + stack[top]);
            stack[top] = 0;
            shrink();
        }
    }

    private void shrink() {
        if(top<=(capacity/2)/2){                // 3/4
            capacity = capacity/2;

            int[] newStack2 = new int[capacity];
            System.arraycopy(stack,0, newStack2,0, top);
            stack = newStack2;
        }
    }

    public void peek(){
        if(top == 0){
            System.out.println("empty!");
        }
        else System.out.println("peek: " + stack[top-1]);
    }

    public void show(){
        for (int i=stack.length-1;i>=0;i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println("\n");
    }

    public void expand(){
        int[] newStack = new int[2*capacity];
        System.arraycopy(stack,0, newStack, 0, top);
        stack = newStack;
        capacity = capacity * 2;
    }
}
