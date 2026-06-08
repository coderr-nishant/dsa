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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int length=(size/2)+1;
        ListNode temp1=head;
        for(int i=1;i<length;i++){
            temp1=temp1.next;
        }
        if (size % 2 != 0) {
            temp1 = temp1.next;
        }
        ListNode head2=temp1;
        if(head2!=null&&head2.next==null){
            if(head.val==head2.val){
                return true;
            }else{
                return false;
            }
        }
        ListNode curr=head2.next;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=temp1;
            temp1=curr;
            curr= nextNode;
        }
        head2.next=null;
        head2=temp1;
       while(head2 != null){
    if(head.val != head2.val) return false;
    head = head.next;
    head2 = head2.next;
}
return true;
    }
}