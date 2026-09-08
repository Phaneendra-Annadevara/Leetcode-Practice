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
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        List<Integer> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        // long num = 0;
        // for(int i=0;i<arr.size();i++){
        //     num = num*10+arr.get(i);
        // }
        // long dnum = num*2;
        // List<Integer> newArr = new ArrayList<>();
        // while(dnum!=0){
        //     int ld = (int) (dnum%10);
        //     newArr.add(ld);
        //     dnum /= 10;
        // }
        // Collections.reverse(newArr);

        // temp = head;
        // ListNode curr = head;
        // int k = 0;
        // while(k<newArr.size()){
        //     curr.val = newArr.get(k);
        //     k++;
        //     // curr = curr.next;
        //     if(k<newArr.size() && curr.next==null){
        //         ListNode newNode = new ListNode(0);
        //         curr.next = newNode;
        //     }
        //     curr = curr.next;
        // }



        int carry = 0;
        for(int i=arr.size()-1;i>=0;i--){
            int value = arr.get(i)*2 + carry;
            arr.set(i,value%10);
            carry = value/10;
        }
        if(carry>0){
            arr.add(0,carry);
        }
        ListNode curr = head;
        int k = 0;
        while(k<arr.size()){
            curr.val = arr.get(k);
            k++;
            if(k<arr.size() && curr.next==null){
                curr.next = new ListNode(0);
            }
            curr = curr.next;
        }
        return head;
    }
}