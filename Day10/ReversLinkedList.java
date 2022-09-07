package Day10;
//1-> 2-> 3-> 4-> 5->null
//null 1-> 2-> 3-> 4-> 5->null
// n    h w   untill line 12  
//null <-1 2->3->4->5->null     line 15 be like
//h.next n h           
public class ReversLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode n=null;
        var h=head;
        while(h!=null)
        {
            var w=h.next;
            h.next=n;
            n=h;
            h=w;
        }
        return n;
    }
}
