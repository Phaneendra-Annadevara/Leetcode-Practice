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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int val = -1;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        if(head==null) return head;
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
           set.add(num);
        }
        while(curr!=null){
            if(set.contains(curr.val)){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                prev = curr;
                curr = curr.next;
            }
        }
        curr = dummy.next;
        prev = dummy;
        return dummy.next;
    }
}