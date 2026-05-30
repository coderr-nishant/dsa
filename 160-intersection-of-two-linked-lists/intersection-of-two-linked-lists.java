/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0,size2=0;
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null){
            size1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            size2++;
            temp2=temp2.next;
        }
        int x=(size1-size2),y=(size2-size1);
        temp1=headA;temp2=headB;
        if(size1>size2){
            while(x!=0){
                temp1=temp1.next;
                x--;
            }
        } else{
            while(y!=0){
                temp2=temp2.next;
                y--;
            }
        }
        while(temp1!=null&&temp2!=null){
            if(temp1==temp2)
            return temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}