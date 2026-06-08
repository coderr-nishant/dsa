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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        ListNode prevNode=head;
        for(int i=1;i<size/2;i++){
            prevNode=prevNode.next;
        }
        ListNode temp2=prevNode;
        ListNode currNode=prevNode.next;
        while(currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        temp2.next.next=null;
        temp2.next=prevNode;
        ListNode temp3=prevNode;
        
        int maximum=Integer.MIN_VALUE;
        while(temp3!=null){
            maximum= Math.max(maximum,temp3.val+head.val);
            temp3=temp3.next;
            head=head.next;
        }
        return maximum;
    }
}