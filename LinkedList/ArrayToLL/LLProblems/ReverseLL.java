package LinkedList.ArrayToLL.LLProblems;

import LinkedList.ArrayToLL.Node;
public class ReverseLL {
    public static Node reverseLL(Node head){
        Node prev =null, next, curr=head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
