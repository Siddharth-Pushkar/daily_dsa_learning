public class linkedlist {

    public static void main(String[] args) {
        class ListNode {
            int val;
            ListNode next;

            ListNode(int i){
                this.val = val;
                this.next = null;
            }
        }

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);

        ListNode head = a;

        a.next = b;
        b.next = c;
        c.next = d;
        ListNode current = head;




    }
}
