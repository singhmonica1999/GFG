/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        if(head==null) return true;
        Node i=head;
        Node temp=head.next;
        while(temp!=i && temp!=null){
           temp= temp.next;
            
        }
        return (temp==head);
        // Your code here
    }
}