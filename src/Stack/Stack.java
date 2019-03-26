package Stack;

public class Stack {

    int top;
    int[] stack;

    public Stack(int size) {
        stack = new int[size];
    }

    public void push(int data){
        if (top == stack.length){
            System.out.println("Stack is full!");
        }
        else{
            stack[top] = data;
            top++;
        }
    }

    public void pop(){
        System.out.println("pop: " + stack[top-1]);
        stack[top-1] = 0;
        top--;
    }

    public void peek(){
        if(top == 0){
            System.out.println("empty!");
        }
        else System.out.println("peek: " + stack[top-1]);
    }

    public void size(){
        System.out.println("size: " + top);
    }

    public void isEmpty(){
        if(top==0){
            System.out.println("true");
        }
        else System.out.println("false");
    }

    public void show(){
        for (int i=stack.length-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

}
