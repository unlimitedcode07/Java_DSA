package linkdlist1;

public class ListNode {
    public int val;
    public ListNode next ;
    public ListNode(int val){
        this.val = val;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" --> ");
            if(temp.next == null){
                System.out.print("Null");
            }
            temp = temp.next;
        }

    }
}
