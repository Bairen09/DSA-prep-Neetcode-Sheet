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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N=0;
        ListNode temp1=head;
        while(temp1!=null){
            N++;
            temp1=temp1.next;
        }
        if(N==n){
            return head.next;
        }
        ListNode temp2=head;
        int a=N-n-1;
        for(int i=0;i<a;i++){
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;

        return head;
    }

}
