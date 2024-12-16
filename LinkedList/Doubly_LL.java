package com.LinkedList;

public class Doubly_LL {
    private Node head;
    private class Node{

        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev=node;
        }
        head = node;
    }

    public void insertLast(int val){
    Node node = new Node(val);
    Node last = head;
    node.next = null;
    if(head==null){
        node.prev = null;
        head = node;
        return;
    }
    while(last.next!=null){
        last =last.next;
    }
    last.next =node;
    node.prev=last;

    }

    //Insert no. after any element in the DLL
    public void insert(int after, int val){
        Node temp = find(after);
        if(temp == null){
            System.out.println("Doesn't exist");
            return;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next!= null){
            node.next.prev = node;
        }
    }

  //To check that node is present in DLL
  public Node find(int val){
        Node node =head;
      while (node != null) {
          if(node.val== val){
              return node;
          }
          node = node.next;
      }
      return null;
  }



    public void display(){
        Node node = head;
        Node last = null;
        while (node!=null){
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print to reverse:-");
        while(last!=null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("START");
    }
}
class mainDLL {
    public static void main(String[] args) {

        Doubly_LL list = new Doubly_LL();
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);
        list.display();
       /* list.insertLast(9);
        list.display();*/
        list.insert(8,11);
        list.display();


    }
}
