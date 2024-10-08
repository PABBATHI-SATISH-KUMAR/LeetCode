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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode itr1 = l1;
        ListNode itr2 = l2;
        ListNode itr3 = l1;
        int c = 0;
        int b=0;
        while(itr1 != null && itr2 != null){
            int a = itr1.val + itr2.val;
            a+=c;
            c=0;
            if(a>9){
                c=a/10;
                a=a%10;
            }
            itr1.val=a;
            itr2.val=a;
            itr3=itr1;
            itr1=itr1.next;
            itr2=itr2.next;
        }
        while(itr1 != null){
            int a = itr1.val;
            a+=c;
            c=0;
            if(a>9){
                c=a/10;
                a=a%10;
            }
            itr1.val=a;
            itr3=itr1;
            itr1=itr1.next;
        }
        while(itr2 != null){
            int a = itr2.val;
            a+=c;
            c=0;
            if(a>9){
                c=a/10;
                a=a%10;
            }
            itr2.val=a;
            itr3=itr2;
            itr2=itr2.next;
            b=1;
        }
        if(c!=0){
            ListNode x = new ListNode();
            x.val=c;
            itr3.next = x;
            x.next=null;
        }
        if(b==1){
            return l2;
        }
        return l1;
    }
}