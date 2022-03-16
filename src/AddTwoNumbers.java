public class AddTwoNumbers {

    //Java Solution to add two numbers
  //  You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
  //  Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
  //  Output: [8,9,9,9,0,0,0,1]
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }



    public  ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
       // If there are remaining nodes (l1, l2) in both two linked lists, the result linked list node gets value from ((l1.val + l2.val + carry) % 10).
        while (l1 != null && l2 != null) {
            int value = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            ListNode result = new ListNode(value);
            current.next = result;
            l1 = l1.next;
            l2 = l2.next;
            current = result;
        }

        //If there is only one linked list has remaining node, the esult linked list node gets value ((l1.val + carry) % 10 or (l2.val + carry) % 10).
        while (l1 != null) {
            int value = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            ListNode result = new ListNode(value);
            current.next = result;
            l1 = l1.next;
            current = result;
        }

        while (l2 != null) {
            int value = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            ListNode result = new ListNode(value);
            current.next = result;
            l2 = l2.next;
            current = result;
        }
        // If neither of the linked lists has remaining nodes, we should check if there is still carryover value.
        if (carry != 0) {
            ListNode result = new ListNode(carry);
            current.next = result;
            current = result;
        }

        return dummy.next;
    }





    public static void main (String [] args){
        AddTwoNumbers obj = new AddTwoNumbers();
        ListNode l1 = new ListNode(9);
        ListNode current = l1;
        ListNode l12 = new ListNode(9);
        current.next = l12;
        ListNode l2 = new ListNode(9);
        ListNode temp = l2;
        ListNode l22 = new ListNode(9);

        temp.next = l22;


        ListNode result =  obj.addTwoNumbers(current,temp);
        while(result != null ){
            System.out.println(result.val);
            result = result.next;
        }


    }
}
