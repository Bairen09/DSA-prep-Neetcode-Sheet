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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode dummy=head;
        int length=1;
        while(dummy.next!=null){
            length++;
            dummy=dummy.next;
        }
        dummy.next=head;

        k=k%length;
        int move=length-k-1;
        ListNode newTail=head;

        for(int i=0;i<move;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;

        return newHead;
    }
}