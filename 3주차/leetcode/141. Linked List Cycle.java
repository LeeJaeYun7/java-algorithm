
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // slow, fast라는 두 개의 노드를 지정하고,
        // head로 초기화한다. 
        ListNode slow = head;
        ListNode fast = head;
   
        // slow는 한 칸씩, fast는 두 칸씩 이동한다
        // 이 때, cycle이 존재한다면, slow와 fast는 반드시 일치하게 된다.
        // 왜냐면, slow는 한 칸씩, fast는 두 칸씩 가게 되면, 
        // 항상 fast가 한 칸씩 더 가게 되는데,
        // 만약 cycle이 존재한다면, cycle의 길이만큼 fast가 더 가게 되었을 때,
        // 그 지점에서 slow와 fast가 만나게 되기 때문이다. 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false; 
    }
}
