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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode temp = null;
        ListNode rev = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = rev;
            rev = curr;
            curr = temp;
        }
        return rev;
    }
    public int pairSum(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        ListNode start = head;
        ListNode middle = reverse(s);

        int sum = 0;
        int maxSum = 0;
        while(middle!=null){
            sum = start.val+middle.val;
            maxSum = Math.max(sum,maxSum);
            start = start.next;
            middle = middle.next;
        }
        return maxSum;
    }
}