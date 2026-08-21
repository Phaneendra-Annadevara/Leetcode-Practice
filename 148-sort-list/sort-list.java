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
    public ListNode sortList(ListNode head) {
        List<Integer> res = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            res.add(temp.val);
            temp = temp.next;
        }
        // for(int i=0;i<res.size();i++){
        //     for(int j=i+1;j<res.size();j++){
        //         if(res.get(i)>res.get(j)){
        //             Collections.swap(res,i,j);
        //         }
        //     }
        // }
        Collections.sort(res);
        ListNode curr = head;
        int k = 0;
        while(curr!=null){
            curr.val = res.get(k);
            curr = curr.next;
            k++;
        }
        return head;
    }
}