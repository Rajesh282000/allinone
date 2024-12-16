package com.LinkedList;
//Linked list using recursion
public class RecursionLL {
    private Node head;
    private Node tail;
    private int size;

    RecursionLL(){
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
    //insert value in node using recursion

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val,int index, Node node ){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1,node.next);
        return node;
    }

    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.println("END");
    }
}

class mainRecursionLL{
    public static void main(String[] args) {
        RecursionLL list = new RecursionLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(9);
        list.display();
        list.insertRec(88,2);
        list.display();

    }
}
