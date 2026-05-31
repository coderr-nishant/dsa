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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode left=list1,right=list1;
        for(int i=1;i<a;i++){
            left=left.next;
        }
        for(int i=1;i<=b+1&&right!=null;i++){
            right=right.next;
        }
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        left.next=list2;
        temp.next=right;
        return list1;
    }
}