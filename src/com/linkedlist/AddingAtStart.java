package com.linkedlist;

public class AddingAtStart {
    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void insertingAtStart(int data){
        Node newNode=new Node(data);//creating new node
        if(head==null){ //check if the list is empty
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head; //head element will move to newNode
            head=newNode; //newNode will become head
        }
    }
    public void display(){ //display() will display all the nodes present in the list
        if (head==null){
            System.out.println("Linked list is empty");
        }
        else
        {
            Node current =head;
            while (current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List!");
        AddingAtStart list=new AddingAtStart();
        list.insertingAtStart(70);
        list.insertingAtStart(30);
        list.insertingAtStart(56);
        list.display();
    }
}
