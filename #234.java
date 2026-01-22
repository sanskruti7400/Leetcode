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
 import java.util.Stack;
class Solution {

    public boolean check(ListNode head){
        Stack<Integer> stack=new Stack<>();

        ListNode trav=head;
        while(trav.next!=null){
            trav=trav.next;
            stack.push(trav.val);
        }
        for(trav=head;trav.next!=null;trav=trav.next){
            if(trav.val!=stack.pop()){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        boolean flag=check(head);

        if(flag==true){
            return true;
        }

        return false;
    }
}
