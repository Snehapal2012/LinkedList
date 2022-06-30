package com.linkedlist;
//Represent a node of the singly linked list
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}

public class CreatingLinkedList {

    //Represent the head and tail of the singly linked list
    public Node head=null;
    public Node tail=null;
    public void inserting(int data){
        //Create a new node
        Node newNode=new Node(data);
        if(head==null){ //Checks if the list is empty
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode; //newNode will be added after tail such that tail's next will point to newNode
            tail=newNode; //newNode will become new tail of the list
        }

    }

    public void display(){ //display() will display all the nodes present in the list
        Node current =head;
        if (head==null){
            System.out.println("Linked list is empty");
        }System.out.println("Adding nodes to the linked list: ");
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        CreatingLinkedList list=new CreatingLinkedList();
        list.inserting(56);
        list.inserting(30);
        list.inserting(70);
        list.display();
    }
}
