
public class linkedlistpractice {

    public static void main(String[] args) {

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode head = a;

        ListNode current = head;
        ListNode current2 = head;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        int count = 0;
        int target = 60;
        String status = "Not Found";

        while (current2 != null){
            if (current2.val == target){
                status = "Found";
            }
            current2 = current2.next;
        }

        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
            count++;
        }
        System.out.println();
        System.out.println("Number of nodes are: "+count);
        System.out.println(status);
    }
}
