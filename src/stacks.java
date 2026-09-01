public class stacks {
    private int[] arr;
    private int capacity;
    private int top;

    void push(int x) {
        if (top == arr.length-1) {
            System.out.println("Stack Overflow");
            return; }

        arr[top] = x; top++;
    }

    public static void main(String[] args) {

    }
}
