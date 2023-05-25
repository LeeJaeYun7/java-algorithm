// 왜 맞았는가?
// 1. 새로운 노드 tmp를 만든다
// 2. 그 노드를 기존 노드인 res에 연결해준다.
// 3. tmp노드를 res노드로 대체한다.
// 4. 이 작업을 head 노드를 순회하면서, head 노드가 끝날때까지 반복한다.

// 시간 복잡도: O(N)
// 공간 복잡도: O(1)

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
        
        ListNode res = null;

        while(head != null){
            ListNode tmp = new ListNode(head.val);
            tmp.next = res; 
            res = tmp;
            head = head.next; 
        }

        return res; 
    }
}
