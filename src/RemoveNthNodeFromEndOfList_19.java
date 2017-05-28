//Given a linked list, remove the nth node from the end of list and return its head.

public class RemoveNthNodeFromEndOfList_19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
    //holder for head node
    ListNode result = head;
    
    //Find the number from front to end rather than end to first
    int num=0;
    while(head != null) {
        num++;
        head = head.next;
    }
    num = num-n;
    System.out.println(num);
    //make head head of list again
    head = result;
    
    //Traverse list until proper node is found
    int count=0;
    
    if(count == num)
        return result.next;
    
    while(head != null) {
        //Temp holder for current node
        ListNode temp = head;
        count++;
        head = head.next;
        
        //If at proper node
        if(count == num) {
            temp.next = head.next;
        }
        
    }
    return result;
    
    
}
}
