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

        ListNode curr = head;
        ListNode res = null; 

        while(curr != null){
            ListNode tmp = new ListNode(curr.val);
            tmp.next = res;
            res = tmp; 
            curr = curr.next; 
        }

        return res; 
        
    }
}
