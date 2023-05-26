import java.util.*; 

class Solution {
    public ListNode findNthFromEnd(ListNode head, int n) {
        
        ListNode curr1 = head;
        ListNode curr2 = head;
        int total1 = 0;
        int total2 = 0; 
        ListNode res = null;
        
        while(curr1 != null){
            total1++;
            curr1 = curr1.next;
        }
        
        while(curr2 != null){
            total2++;
            if(total1 - total2 == n){
                res = new ListNode(curr2.next.val);
                break; 
            }
            curr2 = curr2.next;
        }
        
        
        
        return res; 
        
        
        

    }
}
