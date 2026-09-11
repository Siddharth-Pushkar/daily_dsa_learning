public class stacks {
    public int[] arr;
    public int top;

    public stacks(int capacity) {
        arr = new int[capacity];
        top = 0;
    }

    public void push(int x) {
        if (top == arr.length) {
            System.out.println("Stack Overflow: "+ x +" could not be added");
            return;
        }
        arr[top] = x;
        top++;
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack Underflow: Pop could net be performed");
            return -1;
        }
        top--;
        return arr[top];
    }

    public int peek() {
        if (top == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int tt = arr[top - 1];
        return tt;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == arr.length;
    }

    public static void main(String[] args) {
        stacks s = new stacks(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
        s.push(40);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());

    }
}
