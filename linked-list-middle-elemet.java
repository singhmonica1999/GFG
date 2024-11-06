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
//Given the head of a singly linked list, return the middle node of the linked list.

// If there are two middle nodes, return the second middle node.
// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.

 
class Solution {
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode temp=head;
ListNode ll;
      while(temp!=null)
      {
        temp=temp.next;
length++;
      }
    int  i=0;
      if(length%2==0){
         i=(length/2)+1;
      }
      else{
        i=(int)Math.ceil(length/2.0);
         System.out.println(i);
      }
       ListNode temps=head;
   
 while(i>1){
    temps=temps.next;
    i--;
 }
 return temps;
    }
}

//optimized

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
    public ListNode middleNode(ListNode head) {
ListNode fast=head;
ListNode slow=head;
while(fast!=null && fast.next!=null){
    fast=fast.next.next;
    slow=slow.next;

}
return slow;

}
}
