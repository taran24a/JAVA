package DAY8;

//Functions of linked list:

//Insert at head
//Insert at tail
//Insert at specific position
//Print the list
//Length of list
//Delete at head
//Delete at tail
//Delete at specific position

import java.util.*;
class Node{
    int data;
    Node next;
    //constructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList{
    Node head = null;
    Node tail = null;
    //Insert at head
    void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //printing the list
    void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.print();
    }
}