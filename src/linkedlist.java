class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class linkedlist {
    public static void main(String[] args) {

        ListNode a = new ListNode(5);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(12);
        ListNode d = new ListNode(17);
        ListNode head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode current = head;
        int avoid = 12;

        while (current != null) {
            if (current.val == avoid){
                current = current.next;
                continue;
            }
            System.out.print(current.val + " ");
            current = current.next;
        }




    }
}
