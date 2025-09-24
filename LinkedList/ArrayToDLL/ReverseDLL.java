package LinkedList.ArrayToDLL;

import java.util.Stack;

public class ReverseDLL {
    public static Node reverseDll(Node head){
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }

        Node newHead = new Node(stack.pop());
        Node prev = newHead;
        Node next = newHead;
        while (!stack.empty()){
            Node newNode = new Node(stack.pop());
            next = newNode;
            prev.next = next;
            next.prev = prev;
            prev = next;
        }

        return newHead;
    }

//    public static void stackDisplay(Stack<Integer> stack){
//        while(!stack.empty()){
//            System.out.println(stack.pop());
//        }
//    }
}
