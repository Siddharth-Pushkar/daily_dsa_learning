class ListNode {
    int val;
    ListNode next;

    ListNode(int i){
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

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }




    }
}
