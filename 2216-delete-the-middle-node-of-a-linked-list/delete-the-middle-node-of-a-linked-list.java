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
       ListNode temp = head;
       ListNode prev = head;
       if(head==null || head.next==null) return null;
       int count = 0;
       while(prev!=null){
        
        prev = prev.next;
        count++;
       } 
       int mid = count/2;
       for(int i=1;i<mid;i++){
        temp = temp.next;
       }
       prev = head;
       for(int i=1;i<mid+2;i++){
        prev = prev.next;
       }
       temp.next = prev;
       return head;

    }
}