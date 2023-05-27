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
    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> arr = new ArrayList<>(); 

        while(head != null){
            int val = head.val;
            arr.add(val); 
            head = head.next;
        }

        int len = arr.size();

        for(int i=0; i<len/2; i++){
            if(arr.get(i) == arr.get(len-1-i)){
                continue;
            }else{
                return false;
            }
        }

        return true; 


    }
}
