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
    public void reorderList(ListNode head) {
         ListNode fast = head;
         ListNode slow = head ;
         while(fast!=null && fast.next!=null){
             slow = slow.next ;
             fast = fast.next.next;
         }
         fast = slow.next;
         slow.next =null;
         ListNode prev = null;
         ListNode next = null;
          while(fast!=null){
             next = fast.next;
             fast.next = prev;
             prev = fast;
             fast = next ;
         }
         slow =head;
         while(slow!=null && prev!=null){
             ListNode temp1 = slow.next;
             slow.next = prev;
            ListNode temp2 = prev.next;
             prev.next=temp1;
             slow = prev.next;
             prev = temp2;
         }
    }
}