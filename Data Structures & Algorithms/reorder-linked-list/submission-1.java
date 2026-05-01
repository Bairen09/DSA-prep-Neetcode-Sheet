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
        if(head==null||head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=slow;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode currNode=slow.next;
        ListNode prev=null;
        slow.next=null;
        while(currNode!=null){
            ListNode nextNode=currNode.next;

            currNode.next=prev;

            prev=currNode;
            currNode=nextNode;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }

    }
}
