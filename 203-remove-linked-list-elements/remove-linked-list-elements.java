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
    public ListNode removeElements(ListNode head, int val) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        List<Integer> newArr = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=val){
                newArr.add(arr.get(i));
            }else{
                continue;
            }
        }
        int size = newArr.size();
        ListNode ll = new ListNode(-1);
        ListNode curr = ll;
        int k = 0;
        while(k<size){
            if(curr.next == null){
                ListNode tail = new ListNode(newArr.get(k));
                curr.next = tail;
                curr = curr.next;
            }
            k++;
        }
        return ll.next;
    }
}