// LeetCode 23: Merge k Sorted Lists
// Approach: Use a Min-Heap (PriorityQueue) to always extract the smallest node.
// Time Complexity: O(N log k), where k = number of lists
// Space Complexity: O(k)

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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for(ListNode list: lists){
            if(list!=null){
                pq.offer(list);
            }
        }

        ListNode result = new ListNode(0);
        ListNode current=result;

        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            current.next=node;
            current=current.next;

            if(node.next!=null){
                pq.offer(node.next);
            }
        }

        return(result.next);
    }
}
