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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        ListNode even1=new ListNode(0);
        ListNode odd1=new ListNode(0);
        int size=0;
        ListNode even=even1,odd=odd1;
        while(temp!=null){
            size++;
            if(size%2!=0){
                odd.next=temp;
                odd=odd.next;
            }else{
                even.next=temp;
                even=even.next;
            }
            temp=temp.next;
        }
        even.next = null;
        odd.next=even1.next;
        head=odd1.next;
        return head;
    }
}