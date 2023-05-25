// 왜 맞았는가?
// 1. 전체 값들을 arr에 담아줬다.
// 2. ListNode curr과 ListNode res를 활용했다.
// 3. 해당하지 않는 것을 제외하고, 새로운 것을 만들어서 반환했다. 

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }

        ListNode curr = new ListNode(0);
        ListNode res = curr; 
        int len = arr.size(); 

        for(int i=0; i<len; i++){
             if(len - i == n){
                 continue;
             }else{
                 ListNode tmp = new ListNode(arr.get(i));
                 curr.next = tmp; 
                 curr = curr.next;  
             }   
        }

        return res.next; 



    }
}
