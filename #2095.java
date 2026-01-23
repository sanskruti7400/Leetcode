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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        int i=0;
        ListNode trav=head;
        ListNode curr=head;

        while(trav!=null){
            i++;
            trav=trav.next;
        }
        int mid=i/2;
        for(int j=1;j<mid;j++){
            curr=curr.next;
        } 

        curr.next=curr.next.next;
        return head;
    }
}
