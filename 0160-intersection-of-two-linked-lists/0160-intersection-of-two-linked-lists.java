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
        int nA=size(headA);
        int nB=size(headB);
        int diff=Math.abs(nA-nB);
        if(nA>nB)
        {
            for(int i=0;i<diff;i++)
                headA=headA.next;
        }
        if(nB>nA)
        {
            for(int i=0;i<diff;i++)
                headB=headB.next;
        }
        while(headA!=null && headB!=null)
        {
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    public int size(ListNode A)
    {
        int count=0;
        while(A!=null)
        {
          count++;
            A=A.next;
        }
        return count;
    }
}