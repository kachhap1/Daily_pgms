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
  
    
    public boolean isPalindrome(ListNode head) 
    {
           ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
       
        ListNode curr = mid;
        ListNode prev =null;
        ListNode next;
        while(curr!=null){
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        ListNode rightHead = prev;
        ListNode leftHead = head;
        while(rightHead!= null)
        {
            if(rightHead.val != leftHead.val)
            {
                return false;
            }
            rightHead=rightHead.next;
            leftHead=leftHead.next;
        }
        return true;
    }
}
