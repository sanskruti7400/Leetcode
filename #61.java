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
    public ListNode rotateRight(ListNode head, int k) {

        System.out.println(k);
        if (head == null || head.next == null || k == 0){
            return head;
        }

        ListNode newNode =head;

        int l=1;

        while(newNode.next!=null){
            newNode=newNode.next;
            l++;
        }
        newNode.next=head;

        k = k % l;
        if (k == 0) {
            newNode.next = null;
            return head;
        }
        ListNode res=head;
        k=l-k;
        while(k!=1){
            res=res.next;
            k--;
        }

        head=res.next;
        res.next=null;

        return head;
    }
}
