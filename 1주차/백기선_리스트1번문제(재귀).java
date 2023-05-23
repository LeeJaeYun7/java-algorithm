// 왜 맞았는가?
// 1. 재귀적으로 접근하면서 하나씩 잘라들어간다.
// 2. 다음 노드의 다음 노드가 현재를 가리키도록 하면, 가리키는 순서가 바뀐다.
// 3. 현재 노드의 다음 노드는 null 처리를 해준다. 

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
        
        if(head == null || head.next == null){
            return head; 
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead; 
    }
}
