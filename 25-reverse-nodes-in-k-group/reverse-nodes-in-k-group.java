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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp  = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int length = cnt/k;
        ListNode rev = null;
        ListNode curr = head;
        ListNode tem = null;
        ListNode ans = null;
        ListNode prevtail = null;
        for(int i=0;i<length;i++){
            int kcnt = k;
            rev = null;
            ListNode partlist = curr;
            while(kcnt>0){
                tem = curr.next;
                curr.next = rev;
                rev = curr;
                curr = tem;
                kcnt--;   
            }
            if(i==0){
                ans= rev;
            }else{
                prevtail.next = rev;
            }
            partlist.next = curr;
            prevtail = partlist;
        }
        return ans;
    }
}