package Day10;



public class MergTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ln=new ListNode();
        var fn=ln;

        while (list1!=null|| list2!=null) {
            if(list1!=null&& list2==null)
            {
                fn.next=list1;
                list1=null;
            }
            else
            if(list1==null&& list2!=null)
            {
                fn.next=list2;
                list2=null;
            }
            else
            {
                if(list1.val>list2.val)
                {
                    fn.next=list2;
                    list2=list2.next;
                    fn=fn.next;
                }
                else
                {
                    fn.next=list1;
                    list1=list1.next;
                    fn=fn.next;
                }
            }
        }
        return ln.next;
    }
}
