/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)
            return head;
        Node pseudo=new Node(0,null,head,null);
        flatten(pseudo,head);
        pseudo.next.prev=null;
        return pseudo.next;
    }
    public Node flatten(Node prev,Node curr)
    {
        if(curr==null)
            return prev;
        curr.prev=prev;
        prev.next=curr;
        Node temp=curr.next;
        Node tail=flatten(curr,curr.child);
        curr.child=null;
        return flatten(tail,temp);
    }
}