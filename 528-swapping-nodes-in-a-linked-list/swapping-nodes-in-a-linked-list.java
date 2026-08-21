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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> res = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            res.add(temp.val);
            temp = temp.next;
        }
        int i=k-1;
        int j = res.size()-k;
        Collections.swap(res,i,j);
        ListNode curr = head;
        int a = 0;
        while(curr!=null){
            curr.val = res.get(a);
            curr = curr.next;
            a++;
        }
        return head;
    }
}