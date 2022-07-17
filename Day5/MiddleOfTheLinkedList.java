package Day5;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        
    }
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

    public ListNode middleNode(ListNode head) {
        ListNode mid=head;
        int count=1;
        while(head.next!=null)
        {
            count++;
            head=head.next;
            if(count%2==0){
            mid=mid.next;
            }
        }
        return mid;
    }
}
