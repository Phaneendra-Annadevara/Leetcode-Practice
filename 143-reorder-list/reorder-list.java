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
        List<Integer> arr = new ArrayList<>();
        ListNode tem = head;
        while(tem!=null){
            arr.add(tem.val);
            tem = tem.next;
        }
        List<Integer> res = new ArrayList<>();
        int i=0;
        int j = arr.size()-1;
        while(i<=j){
            res.add(arr.get(i));
            i++;
            if(i<j){
                res.add(arr.get(j));
                j--;
            }
        }
        ListNode curr = head;
        int k = 0;
        while(curr!=null){
            curr.val = res.get(k);
            curr = curr.next;
            k++;
        }
        
    }
}