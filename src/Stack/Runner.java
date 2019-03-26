package Stack;

public class Runner {

    public static void main(String[] args) {

        DynamicStack obj = new DynamicStack();
        obj.push(5);
        obj.push(10);
        obj.push(15);
        obj.push(25);
        obj.push(30);
        obj.show();

        obj.pop();
        obj.pop();
        obj.pop();
        obj.show();
    }
}
