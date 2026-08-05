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
        ListNode prev = head;
        int count = 0;
        while(prev!=null){
            count++;
            prev = prev.next;
        }
        int mid = count/2;
        ListNode temp = head;
        for(int i=1;i<mid+1;i++){
            temp = temp.next;
           
        }
         head = temp;
         return head;
    }
}