package LinkedList.ArrayToLL.LLProblems;

import LinkedList.ArrayToLL.Node;

public class AddingTwoNumberFromTwoLL {
    public static Node addingTwoNumberFromLL(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node curr = dummy ;
        int carry = 0;
        while(head1 !=null || head2 !=null){
           int sum = carry;
           if(head1 != null){
               sum +=head1.val;
           }
            if(head2 != null){
                sum +=head2.val;
            }
            carry = sum/10;
            Node newNode = new Node(sum%10);
            curr.next = newNode;
            curr = newNode;
            if(head1 != null){
               head1 = head1.next;
            }
            if(head2 != null){
                head2 = head2.next;
            }
        }

        if(carry>0){
            Node newNode1 = new Node(carry);
            curr.next = newNode1;
            curr = newNode1;
        }
        return dummy.next;


    }
}

