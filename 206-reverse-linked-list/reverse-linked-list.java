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
    public ListNode reverseList(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr = curr.next;
        }
        int l = 0;
        int r = arr.size()-1;
        while(l<r){
            Collections.swap(arr,l,r);
            l++;
            r--;
        }
        ListNode temp = head;
        int i=0;
        while(i<arr.size()){
            temp.val = arr.get(i);
            temp= temp.next;
            i++;
        }
        
        return head;
    }
}