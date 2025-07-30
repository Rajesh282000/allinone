package LinkedList;

import org.w3c.dom.Node;

public class Linked_list {
    private Node head;
    private Node tail;
    private int size;

    Linked_list(){
        this.size=0;
    }

   private class Node{
        private int val;
        private Node next;

        Node(int val){
            this.val=val;
        }

        Node(int val, Node next){
            this.val=val;
            this.next =next;
        }
   }


   public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head =node;
        if(tail == null){
            tail=head;
        }
        size+=1;
   }


   public void insertLast(int val){
        if(tail==null){
         insertFirst(val);
        }
       Node node = new Node(val);
        tail.next = node;
        tail =node;
        size+=1;
   }


    public void insertParticularIndex(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
           insertLast(val);
           return;
        }

        Node temp= head;
        for (int i = 1; i < index ; i++) {
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next=node;
    }


    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst(){
        int val = head.val;
        head =head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = getIndex(size-1);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteParticularIndex(int index)
    {
        if(index==0){
            return deleteFirst();
        }
        if(index == size-1 ){
            return deleteLast();
        }
        Node prev = getIndex(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;

    }

    public Node getIndex(int index){ //getting the index value
        Node temp= head;
        for (int i = 0; i < index ; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public Node find(int val){
        Node node  =head;
        while(node != null ){
          if(node.val == val) {
              return node;
          }
          node =node.next;

        }
        return null;
    }
}
  class main
 {
     public static void main(String[] args) {
         Linked_list list = new Linked_list();
         list.insertFirst(3);
         list.insertFirst(4);
         list.insertFirst(6);
         list.insertFirst(8);
         list.insertFirst(9);
       //  list.display();
         list.insertLast(2);
       //  list.display();
         list.insertParticularIndex(7,2);
          list.display();
       /*   list.deleteFirst();
          list.display();
         list.deleteLast();
         list.display();
         list.deleteParticularIndex(2);
         list.display();*/
         list.find(1);

     }
 }