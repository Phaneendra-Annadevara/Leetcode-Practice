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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode o = odd;
        ListNode even = new ListNode(0);
        ListNode e = even;
        ListNode temp = head;
        int index = 1;
        while(temp!=null){
            if(index%2==1){
                o.next = temp;
                o = o.next;
            }
            else{
                e.next = temp;
                e = e.next;
            }
            temp = temp.next;
            index++;
        }
        e.next = null;
        o.next = even.next;
        return odd.next;
    }
}