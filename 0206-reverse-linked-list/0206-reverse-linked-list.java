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
    public ListNode reverseList(ListNode head) {
       List<Integer> l=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
        l.add(temp.val);
        temp=temp.next;
       }
       int in=l.size()-1;
       temp=head;
       while(temp!=null){
        temp.val=l.get(in);
        in--;
        temp=temp.next;
       }
       return head;
    }
}