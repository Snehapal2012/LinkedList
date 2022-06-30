package com.linkedlist;

import java.util.Scanner;

public class InsertAtSpecificPosition {
    public Node head = null;
    public Node tail = null;

    public Node insertingAtStart(int data) {
        Node newNode = new Node(data);//creating new node
        if (head == null) { //check if the list is empty
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; //head element will move to newNode
            head = newNode; //newNode will become head
        }
        return newNode;
    }

    public void insertingAtEnd(int data) {
        //Create a new node
        Node newNode = new Node(data);
        if (head == null) { //Checks if the list is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; //newNode will be added after tail such that tail's next will point to newNode
            tail = newNode; //newNode will become new tail of the list
        }
    }

    public void insertingInBetween(Node previousNode, Node newNode) {//inserting node in between nodes
        Node tempNode = previousNode.next;//previousNode pointing to tempNode
        previousNode.next = newNode;//newNode pointing to previousNode
        newNode.next = tempNode;//tempNode pointing to newNode
    }

    public void display() { //display() will display all the nodes present in the list
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    public void deleteStart() {
        //Checks if the list is empty
        if (head == null) {
            System.out.println("List is empty");
        } else {
            //Checks whether the list contains only one node
            //If not, the head will point to next node in the list and tail will point to the new head.
            if (head != tail) {
                head = head.next;
            }
        }
    }
    public void deleteEnd(){
        //Checks if the list is empty
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            //Checks whether the list contains only one element
            if(head != tail ) {
                Node current = head;
                //Loop through the list till the second last element such that current.next is pointing to tail
                while(current.next != tail) {
                    current = current.next;
                }
                //Second last element will become new tail of the list
                tail = current;
                tail.next = null;
            }
            //If the list contains only one element
            //Then it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }
    public static void insertStart() {
        InsertAtSpecificPosition list1 = new InsertAtSpecificPosition();
        list1.insertingAtStart(70);
        list1.insertingAtEnd(30);
        list1.insertingAtEnd(56);
        System.out.println("After adding nodes at start:----------");
        list1.display();
        System.out.println();
    }

    public static void insertEnd() {
        InsertAtSpecificPosition list = new InsertAtSpecificPosition();
        list.insertingAtEnd(56);
        list.insertingAtEnd(30);
        list.insertingAtEnd(70);
        System.out.println("After adding nodes at end:----------");
        list.display();
        System.out.println();
    }

    public static void insertBetween() {
        InsertAtSpecificPosition list = new InsertAtSpecificPosition();
        Node secondNode = list.insertingAtStart(70);
        Node firstNode = list.insertingAtStart(56);
        Node newNode = new Node(30);
        list.display();
        list.insertingInBetween(firstNode, newNode);
        System.out.println("After insert:-------");
        list.display();
        System.out.println();
    }

    public static void deleteAtStart() {
        InsertAtSpecificPosition list = new InsertAtSpecificPosition();
        list.insertingAtStart(70);
        list.insertingAtEnd(30);
        list.insertingAtEnd(56);
        System.out.println("After adding nodes at start:----------");
        list.deleteStart();
        list.display();
        System.out.println();
    }
    public static void deleteAtEnd() {
        InsertAtSpecificPosition list = new InsertAtSpecificPosition();
        list.insertingAtEnd(56);
        list.insertingAtEnd(30);
        list.insertingAtEnd(70);
        System.out.println("After adding nodes at end:----------");
        list.deleteEnd();
        list.display();
        System.out.println();
    }
    public void search(int data){
        Node current = head;
        int i = 1;
        boolean flag = false;
        //Checks whether list is empty
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                //Compares node to be found with each node present in the list
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            System.out.println("Element is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }
    public static void searchValue(){
        InsertAtSpecificPosition list=new InsertAtSpecificPosition();
        list.insertingAtEnd(70);
        list.insertingAtEnd(30);
        list.insertingAtEnd(56);
        System.out.println();
        System.out.println("We will check the value 30 is present or not !");
        System.out.println();
        list.search(30);
        System.out.println();
    }
    public static void insertAtSpecificPosition(){
        InsertAtSpecificPosition list=new InsertAtSpecificPosition();
        Node secondNode = list.insertingAtStart(30);
        Node firstNode = list.insertingAtStart(56);
        list.insertingAtEnd(70);
        list.search(30);
        Node newNode = new Node(40);
        list.insertingInBetween(firstNode, newNode);
        System.out.println();
        list.display();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program!");
        System.out.println("NOTE: You can perform Operations for 10 times.");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("1) Insert at Start 2) Insert at End 3) Insert at Middle 4) Delete at Start 5) Delete at End 6) Search by Value 7) Insert at Specific Position 8) End of Operation ");
            System.out.print("Choose the operation you want to perform: ");
            int input=scan.nextInt();
            if(input<8)
            {
                switch (input) {
                    case 1:
                        insertStart();
                        break;
                    case 2:
                        insertEnd();
                        break;
                    case 3:
                        insertBetween();
                        break;
                    case 4:
                        deleteAtStart();
                        break;
                    case 5: deleteAtEnd();
                        break;
                    case 6: searchValue();
                    break;
                    case 7: insertAtSpecificPosition();
                    break;

                }
            }else{
                {
                    System.out.println("Bye Bye!");
                    break;
                }
            }
        }
    }
}
