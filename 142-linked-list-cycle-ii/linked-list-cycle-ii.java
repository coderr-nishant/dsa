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
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
            ListNode hare=head,turtle=head;
            while(hare!=null&&hare.next!=null){
                hare=hare.next.next;
                turtle=turtle.next;
                if(hare==turtle){
                    break;
                }
            }
            if(hare == null || hare.next == null){
            return null;
        }
            ListNode temp=head;
            while(temp!=turtle){
                temp=temp.next;
                turtle=turtle.next;
            }
            return temp;
    }
}