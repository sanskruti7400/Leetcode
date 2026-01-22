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
    public ListNode middleNode(ListNode head) {
        int i=1,m=0,n=0;
        ListNode trav=head;
        while(trav.next!=null){
            trav=trav.next;
            i++;
        }
        trav=head;
        if(i%2==0){
            while(m<i/2){
                trav=trav.next;
                m++;
            }
            return trav;
        }
        while(n<i/2){
            trav=trav.next;
            n++;
        }
        return trav;
    }
}
