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
        Node curr = head;
        while(curr != null) {
            if(curr.child != null) {
                Node tail = curr.child;
                
                while(tail.next != null)
                    tail = tail.next;
                
                tail.next = curr.next;
                if(curr.next != null)
                    curr.next.prev = tail;
                
                curr.next = curr.child;
                curr.next.prev = curr;
                
                curr.child = null;
            }
            curr = curr.next;
        }
        return head;
    }
}