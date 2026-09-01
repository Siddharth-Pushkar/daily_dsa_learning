public class stacks {
    private int[] arr;
    private int top;

    public stacks(int capacity) {
        arr = new int[capacity];
        top = 0;
    }

    void push(int x) {
        if (top == arr.length) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[top] = x;
        top++;
    }

    int pop() {
        if (top == 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        top--;
        return arr[top];
    }

    int peek() {
        if (top == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int tt = arr[top - 1];
        return tt;
    }

    boolean isEmpty() {
        return top == 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        stacks s = new stacks(5);
        int top = 0;

        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();

    }
}
