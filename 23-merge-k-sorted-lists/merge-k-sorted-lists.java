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
      // Define a priority queue (min-heap) where ListNodes are sorted by their values
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each non-empty linked list to the priority queue
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        // Create a dummy node to simplify the process of creating the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Process the priority queue until it's empty
        while (!pq.isEmpty()) {
            // Extract the node with the smallest value from the queue
            ListNode minNode = pq.poll();
            current.next = minNode;
            current = current.next;

            // If the extracted node has a next node, add it to the queue
            if (minNode.next != null) {
                pq.offer(minNode.next);
            }
        }

        // The merged list is pointed to by dummy.next
        return dummy.next;
    } 
}

