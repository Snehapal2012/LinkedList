package com.linkedlist;

public class AddingAtEnd {
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
        public void insertingAtEnd(int data){
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
            System.out.println("Welcome to Linked list Program!");
            AddingAtEnd list=new AddingAtEnd();
            System.out.println("After adding nodes at the end:-------");
            list.insertingAtEnd(56);
            list.insertingAtEnd(30);
            list.insertingAtEnd(70);
            list.display();
        }
}
