/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode trav1=head;
        ListNode trav2=head;
        while(trav2!=null && trav2.next !=null){
            trav1=trav1.next;
            trav2=trav2.next.next;
            if(trav1==trav2){
                trav1=head;
                while(trav1!=trav2){
                    trav1=trav1.next;
                    trav2=trav2.next;
                }
                return trav1;
            }
        }
        return null;
    }
}
