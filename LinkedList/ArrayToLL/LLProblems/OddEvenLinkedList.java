package LinkedList.ArrayToLL.LLProblems;

import LinkedList.ArrayToLL.Node;

import java.util.Arrays;
import java.util.List;

public class OddEvenLinkedList {
    public static List<Node> oddEvenLL(Node head){
        Node temp = head;
        int count =1;
        Node oddDummy = new Node(-1);
        Node oddCurr = oddDummy;

        Node evenDummy = new Node(-1);
        Node evenCurr = evenDummy;

        while(temp != null){
            if(count % 2 !=0){
                Node newNode = new Node(temp.val);
                oddCurr.next = newNode;
                oddCurr = newNode;
            }else{
                Node newNode = new Node(temp.val);
                evenCurr.next = newNode;
                evenCurr = newNode;
            }
            count++;
            temp = temp.next;

        }
        return Arrays.asList(oddDummy.next, evenDummy.next);
    }
}
