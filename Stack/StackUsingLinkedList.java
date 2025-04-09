package Stack;

class Node{
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
    }
}

public class StackUsingLinkedList {
    Node top;
    public StackUsingLinkedList(){
        this.top =null;
    }

    public Boolean isEmpty(){
        return this.top == null;
    }

    public void  push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top = newNode;
    }


    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty. Cant pop.");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty. Cant pop.");
            return -1;
        }
        return  top.data;
    }

    // Display method (optional)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;
        System.out.print("Stack (top -> bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.display();

        System.out.println("Is empty? " + stack.isEmpty());
    }

}
