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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next == null || left==right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp1= head;
        ListNode temp2 = head;
        for(int i=1;i<left;i++){
            prev = temp1;
            temp1 = temp1.next;
        }
        for(int i=1;i<right;i++){
            temp2 = temp2.next;
        }
        ListNode end = temp2.next;
        ListNode t2next = temp2.next;
        ListNode curr = temp1;
        ListNode rev = null;
        ListNode tem = null;
        while(curr!=end){
            tem = curr.next;
            curr.next = rev;
            rev = curr;
            curr = tem;
        }
        prev.next = rev;
        temp1.next = t2next;
        return dummy.next;
    }
}