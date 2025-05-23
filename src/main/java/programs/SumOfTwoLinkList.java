package programs;

public class SumOfTwoLinkList{
public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next =  new ListNode(4);
        listNode.next.next =  new ListNode(3);

        ListNode listNode1 = new ListNode(5);
        listNode1.next =  new ListNode(6);
        listNode1.next.next =  new ListNode(4);

        ListNode li = addTwoNumbers(listNode,listNode1);
        printList(li);

    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;
        int carry = 0;
        while(l1 != null && l2 != null){
            int num1 = (l1 != null) ? l1.value : 0;
            int num2 = (l2 != null) ? l2.value : 0;

            int sum = carry+num1+num2;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return dummyNode.next;
    }
}
 class ListNode {
     int value;
     ListNode next;

     ListNode(int value) {
         this.value = value;
     }

     ListNode(int value, ListNode next) {
         this.value = value;
         this.next = next;
     }
 }