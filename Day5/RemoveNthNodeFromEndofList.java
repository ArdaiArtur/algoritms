package Day5;

public class RemoveNthNodeFromEndofList {


    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) 
     {
         return null;
     }
     // reach that node first
     var tail = head;
     var preDelete = head;
     for (int i = 0; i < n; i++)
     {
         tail = tail.next;
     }
 
         if (tail == null) // toDelete is head
     {
         return head.next;
     }  
        
     while (tail.next != null)
     {
         tail = tail.next;
         preDelete = preDelete.next;
     }
     preDelete.next = preDelete.next.next;
     return head;
    }
}
