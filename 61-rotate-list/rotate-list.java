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
        if(head==null || head.next==null || k==0) return head;
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr= curr.next;
        }
        int size = k%count;
         if(size==0){
            return head;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
       
       int steps = count-size;
       ListNode newTail = head;
       for(int i=1;i<steps;i++){
        newTail = newTail.next;
       }
      ListNode newHead = newTail.next;
      newTail.next = null;
      return newHead;
    }
}