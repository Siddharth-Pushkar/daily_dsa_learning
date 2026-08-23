
public class linkedlistpractice {

    public static void main(String[] args) {

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode head = a;

        ListNode current = head;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        int count = 0;

        while (current != null){

            System.out.print(current + " ");
            current = current.next;
            count++;
        }

        System.out.println();

        System.out.println("Number of nodes are: "+count);
    }
}
