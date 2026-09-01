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
        stacks s = new stacks(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());      // 30

        s.push(40);

        System.out.println(s.peek());     // 40

        System.out.println(s.pop());      // 40
        System.out.println(s.pop());      // 20

        System.out.println(s.isEmpty());  // false

    }
}
