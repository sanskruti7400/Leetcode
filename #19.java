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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack=new Stack<>();
        ListNode trav=head;
        ListNode newNode=null;
        while(trav!=null){
            stack.push(trav);
            trav=trav.next;
        }
        for(int i=0;i<n;i++){
            newNode= stack.pop();
        }

        if(stack.isEmpty()){
            return head.next;
        }

        ListNode prev=stack.pop();

        prev.next=newNode.next;

        return head;
    }
}
