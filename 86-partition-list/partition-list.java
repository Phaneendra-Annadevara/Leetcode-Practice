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
    public ListNode partition(ListNode head, int x) {
        ListNode leftHead = null;
        ListNode leftTail = null;
        ListNode rightHead = null;
        ListNode rightTail = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = null;
            if(curr.val<x){
                if(leftHead==null){
                    leftHead=leftTail = curr;
                }else{
                leftTail.next = curr;
                leftTail = curr;
                }
            }else{
                if(rightHead==null){
                    rightHead=rightTail = curr;
                }else{
                rightTail.next = curr;
                rightTail = curr;
                }
            }
            curr = next;
        }
        if(leftHead==null) return rightHead;
        leftTail.next = rightHead;
        return leftHead;
    }
}