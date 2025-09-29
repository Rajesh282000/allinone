package LinkedList.ArrayToLL;

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

    public static Node insertFirstNode(Node head, int val){
        Node node = new Node(val);
        Node temp = head;
        head =node;
        head.next=temp;
        return head;
    }

    public static Node insertLastNode(Node head, int val){
        if(head == null){
            return insertFirstNode(head, val);
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return head;
    }

    public static Node insertKthNode(Node head, int val, int k){
        if(head == null){
            return insertFirstNode(head, val);
        }
        if(k==1){
            return insertFirstNode(head, val);
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i=1; i<k-1; i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        return head;
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

    public static Node deleteKthNode(Node head, int k){
        if(head == null){
            return null;
        }

        if(k==1) {
            return deleteHeadNode(head);
        }

        int count =0;
        Node temp = head, prev = null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next =  prev.next.next;
                break;

            }else{
                prev=temp;
                temp=temp.next;
            }
        }

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
