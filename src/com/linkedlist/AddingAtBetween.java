package com.linkedlist;

import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddingAtBetween {
    public Node head=null;
    public Node tail=null;
    public Node insertingAtStart(int data){
        Node newNode=new Node(data);//creating new node
        if(head==null){ //check if the list is empty
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head; //head element will move to newNode
            head=newNode; //newNode will become head
        }
        return newNode;
    }
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
    public void insertingInBetween(Node previousNode,Node newNode){//inserting node in between nodes
        Node tempNode=previousNode.next;//previousNode pointing to tempNode
        previousNode.next=newNode;//newNode pointing to previousNode
        newNode.next=tempNode;//tempNode pointing to newNode
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
    public static void insertStart(){
        AddingAtBetween list=new AddingAtBetween();
        list.insertingAtStart(70);
        list.insertingAtStart(30);
        list.insertingAtStart(56);
        System.out.println("After adding nodes at starting:---------");
        list.display();
    }
    public static void insertEnd(){
        AddingAtBetween list=new AddingAtBetween();
        list.insertingAtEnd(56);
        list.insertingAtEnd(30);
        list.insertingAtEnd(70);
        System.out.println("After adding nodes at end:----------");
        list.display();
    }
    public static void insertBetween(){
        AddingAtBetween list=new AddingAtBetween();
        Node secondNode=list.insertingAtStart(70);
        Node firstNode=list.insertingAtStart(56);
        Node newNode=new Node(30);
        list.display();
        list.insertingInBetween(firstNode,newNode);
        System.out.println("After insert:-------");
        list.display();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program!");
        Scanner scan=new Scanner(System.in);
        System.out.print("Choose the operation you want to perform: ");
        System.out.println("1) Insert at Start 2) Insert at End 3) Insert at Middle ");
        switch (scan.nextInt()){
            case 1: insertStart();
                break;
            case 2: insertEnd();
                break;
            case 3: insertBetween();
                break;
        }
    }
}
