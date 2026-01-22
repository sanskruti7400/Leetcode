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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode nextNode=null;
        head=null;
        while(temp!=null){
            nextNode=temp.next;
            temp.next=head;
            head=temp;
            temp=nextNode;
        }
        return head;
    }
}
