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
    public int getDecimalValue(ListNode head) {
        
        int size =0;
        ListNode curr = head;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        int i = size-1;
        int deci =0;
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val==1)
            {
                deci += Math.pow(2,i);
            }
            i--;
            temp = temp.next;
        }
        return deci;
    }
}
