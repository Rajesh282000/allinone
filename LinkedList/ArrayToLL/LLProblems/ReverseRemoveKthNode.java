package LinkedList.ArrayToLL.LLProblems;

import LinkedList.ArrayToLL.Node;

public class ReverseRemoveKthNode {
    public static Node reverseRemovekthNode(Node head, int removeNode){
        Node temp = head, fast = head, slow = head;
        for(int i = 1; i<= removeNode; i++){
            fast = fast.next;
        }

        if(fast ==null){
            return head.next;
        }

        while(fast.next!=null){
            fast= fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
