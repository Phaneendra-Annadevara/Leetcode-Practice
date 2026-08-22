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
    static int gcd(int a, int b){
        while(b!=0){
            int rem  = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp= head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        List<Integer> gcdValues = new ArrayList<>();
        int i=0;
        int j = i+1;
        while(i<arr.size()-1 && j<arr.size()){
            int val = gcd(arr.get(i),arr.get(j));
            gcdValues.add(val);
            i++;
            j++;
        }
        if(head==null || head.next == null) return head;
       ListNode curr = head.next;
       ListNode prev = head;
       int k = 0;
       while(curr!=null){
        int v = gcdValues.get(k);
        ListNode newNode = new ListNode(v);
        newNode.next = curr;
        prev.next = newNode;
        prev = curr;
        curr = curr.next;
        k++;
       }
       return head;
    }
}