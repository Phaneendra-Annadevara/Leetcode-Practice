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
        ListNode tem = null;
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            tem = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tem;
        }
        return pre;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        while(temp1 !=null || temp2!=null || carry!=0){
            int x = (temp1!=null)? temp1.val :0;
            int y = (temp2!=null)? temp2.val : 0;
            int sum = x+y+carry;
            carry = sum/10;
            int dig = sum%10;
            ListNode newNode = new ListNode(dig);
            curr.next = newNode;
            curr = curr.next;
            if(temp1!=null) temp1 = temp1.next;
            if(temp2!=null) temp2 = temp2.next;
        }
        return reverse(head.next);
    }
}