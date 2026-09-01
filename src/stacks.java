public class stacks {
    private int[] arr;
    private int capacity;
    private int top;

    void push(int x) {
        if (top == arr.length-1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[top] = x;
        top++;
    }

    int pop() {
        if (top == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        top--;
        return arr[top - 1];
    }

    public static void main(String[] args) {

    }
}
