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
