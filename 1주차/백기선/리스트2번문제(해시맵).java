import java.util.*; 

class Solution {
    public ListNode findNthFromEnd(ListNode head, int n) {
        
        ListNode curr = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int index = 0; 
        
        while(curr != null){
            map.put(index++, curr);
            curr = curr.next;
        }
        
        return map.get(map.size()-n);

    }
}
