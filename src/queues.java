import java.util.LinkedList;
import java.util.Queue;

public class queues {

    public static void main(String[] args) {


        Queue<Integer> myqueue = new LinkedList<>();
        // Adding elements here in the queues
        myqueue.add(7);
        myqueue.add(6);
        myqueue.add(5);
        myqueue.add(4);
        myqueue.add(3);
        myqueue.add(2);

        // Look into the whatever is the front of the queues
        System.out.println(myqueue.peek());
//      Here in the result the answer here is 7
//      That means first element that will be processed is 7 and in the last is 2. LILO
        for (int i = 0;)
            
    }
}
