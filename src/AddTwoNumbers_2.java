//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
public class AddTwoNumbers_2 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
    if(l1 == null && l2 == null)
     return null;
     if(l1 == null)
         return l2;
     if(l2 == null)
         return l1;
    
    ListNode result = l1;
    ListNode temp = l1;
    boolean carry = false;
    while(l1 != null && l2 != null) {
        l1.val = l1.val+l2.val;
        if(carry == true) {
            l1.val++;
            carry = false;
        } 
        if(l1.val > 9) {
            l1.val = l1.val%10;
            carry = true;
        }
        temp = l1;
        l1 = l1.next;
        l2 = l2.next;
    }
    
    if(l1 == null && l2 == null) {
        if(carry == true)
        {
            ListNode add = new ListNode(1);
             temp.next = add;
        }
    }
    else if(l1 == null) {
        if(carry == true) {
            temp.next=l2;
            ListNode temp2 = l2;
            while(carry == true && l2 != null) {
                l2.val++;
                if(l2.val < 10)
                 carry = false;
                 else {
                     temp2 = l2;
                     l2.val = l2.val%10;
                     l2 = l2.next;
                 }
            }
             if(carry == true){
                 ListNode add = new ListNode(1);
                 temp2.next = add;
             }
        }
        else
         temp.next=l2;
    } else {
        if(carry == true)
         l1.val++;
         
         if(l1.val < 10)
             carry = false;
         else {
             l1.val = l1.val%10;
             temp = l1;
             l1 = l1.next;
             while(carry == true && l1 != null) {
                 l1.val++;
                 if(l1.val < 10)
                     carry = false;
                 else {
                     temp = l1;
                     l1.val = l1.val%10;
                     l1 = l1.next;
                 }
             }
             if(carry == true) {
                 ListNode add = new ListNode(1);
                 temp.next = add;
             }
         }
    }
        
     
    
    return result;
 }
}
