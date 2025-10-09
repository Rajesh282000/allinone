package LinkedList;


public class CLL {

    private Node head;
    private Node tail;


    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val =val;
        }
        public Node (int val, Node next){
            this.val =val;
            this.next =next;
        }
    }


  public void insertNode(int val){
        Node node = new Node(val);
        if(head == null){
            head= node;
            tail =node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail =node;

  }

  public void deleteNode(int val){
        Node node =head;

        if(node == null){
           // insertNode(val);
            return;
        }
        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node temp = node.next;
            if(temp.val== val){
                node.next= temp.next;
                break;
            }
            node =node.next;
        }while (node!=head);

  }

  public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.val+ "->");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
  }

}
class mainCLL{
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertNode(6);
        list.insertNode(7);
        list.insertNode(8);
        list.insertNode(9);
        list.insertNode(10);
        list.display();
        list.deleteNode(7);
        list.display();

    }
}

