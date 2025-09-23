package LinkedList.ArrayToDLL;


class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }
}

public class DLLUtilityMethod {
    public static Node ArrayToDLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            prev.next = node;
            node.prev = prev;
            prev = node;
        }
        return head;
    }

    //deletion operation
    public static Node deletionHead(Node head){
        head =head.next;
        head.prev =null;
        return head;

    }

    public static Node deletionLastNode(Node head){
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        Node prev = temp.prev;
        prev.next =null;
        return head;

    }

    public static Node deletionKthNode(Node head, int k){

        Node temp = head;
        int count =0;

        while(temp.next != null){
           count++;
           if(count == k){
              Node next = temp.next;
              Node prev = temp.prev;
              next.prev = prev;
              prev.next = next;
              break;
           }else{
               temp =temp.next;
           }

        }
        return head;
    }

    //insertion Operation
    public static Node insertHead(Node head, int val){
        Node node = new Node(val);
        node.next = head;
        head.prev = node;
        head =node;
        return head;
    }

    public static Node insertLastNode(Node head, int val){
        Node node = new Node(val);
        Node temp = head;

        while(temp.next !=null){
            temp= temp.next;
        }

        temp.next = node;
        node.prev=temp;

        return head;
    }

    public static Node insertKthNode(Node head, int val, int position) {
        Node node = new Node(val);

        if (position == 1) {
            node.next = head;
            if (head != null) {
                head.prev = node;
            }
            return node;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }
        Node next = temp.next;
        node.next = next;
        node.prev = temp;
        temp.next = node;

        if (next != null) {
            next.prev = node;
        }

        return head;
    }



    public static void displayDLL(Node head) {
        Node temp = head;
        System.out.print("null <- ");
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" <-> ");
            } else {
                System.out.print(" -> null");
            }
            temp = temp.next;
        }
        System.out.println();
    }

}
