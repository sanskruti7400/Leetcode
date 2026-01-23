/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode trav1=head;
        ListNode trav2=head.next;
        ListNode startOfEven=trav2;

        while (trav2 != null && trav2.next != null) {
            trav1.next = trav2.next;
            trav1 = trav1.next;

            trav2.next = trav1.next;
            trav2 = trav2.next;
        }

        trav1.next=startOfEven;
        return head;
    }
}
