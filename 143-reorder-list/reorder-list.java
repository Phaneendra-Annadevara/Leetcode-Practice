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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
            if(head==null|| head.next==null) return;
        while(fast!=null && fast.next!=null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow;
        prev.next = null; //1st part made seperated
        ListNode rev = null;
        ListNode temp = null;
        ListNode curr = slow;
        while(curr!=null){
            temp = curr.next;
            curr.next = rev;
            rev = curr;
            curr = temp;
        }

        ListNode t1 = head;
        ListNode t2 = rev;
        ListNode merge = new ListNode(-1);
        ListNode newCurr = merge;
        int cnt = 0;
        while(t1!=null && t2!=null){
            if(cnt%2==0){
                newCurr.next= t1;
                t1 = t1.next;
                cnt++;
            }else{
                newCurr.next = t2;
                t2 = t2.next;
                cnt++;
            }
            newCurr = newCurr.next;
        }
        if(t1==null){
            newCurr.next = t2;
        }else{
            newCurr.next = t1;
        }
        head.next = merge.next.next;
       
    }
}