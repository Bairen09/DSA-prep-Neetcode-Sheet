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
        int lengthA=0, lengthB=0;
        ListNode currA=headA;
        ListNode currB=headB;
        while(currA!=null){
            lengthA++;
            currA=currA.next;
        }
        while(currB!=null){
            lengthB++;
            currB=currB.next;
        }
        while(lengthA>lengthB){
            lengthA--;
            headA=headA.next;
        }
        while(lengthA<lengthB){
            lengthB--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}