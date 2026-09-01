public class stacks {
    private int[] arr;
    private int capacity;
    private int top;

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
        return arr[top - 1];
    }

    int peek() {
        if (top == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int tt = arr[top - 1];
        return tt;
    }

    public static void main(String[] args) {

    }
}
