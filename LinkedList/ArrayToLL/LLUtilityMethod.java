package LinkedList.ArrayToLL;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }

}

public class LLUtilityMethod {
    public static Node insertArrayElementToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++) {
            Node node = new Node(arr[i]);
            temp.next = node;
            temp = temp.next;
        }
        return head;
    }

    public static void displayLL(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static Node deleteHeadNode(Node head){
        head = head.next;
        return head;
    }

    public static Node deleteLastNode(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static void searchElementInLL(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == key) {
                System.out.println("Element found at " + temp.val);
            }
            temp = temp.next;
        }
    }
}
