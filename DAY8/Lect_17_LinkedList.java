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
public class Lect_17_LinkedList{
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
    //insertAtTail
    void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        if(tail!=null){
            tail.next=newNode;
            tail=newNode;
        }
    }
    //insertAtSpecificPosition
    void insertAtPosition(int data, int pos){
        if(pos<0 || pos>length()){
            System.out.println("Invalid position");
            return;
        }
        if(pos==1){
            insertAtHead(data);
            return;
        }
        if(pos==length()){
            insertAtTail(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=1;
        while(i<pos-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //delete at head
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    //printing the list
    void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.data);
                return;
            }
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    //Length of list
    int length(){
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Lect_17_LinkedList list = new Lect_17_LinkedList();
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.insertAtTail(60);
        list.print();
        System.out.println();
        list.insertAtPosition(70, 3);
        list.insertAtPosition(90, 7);
        list.print();
        System.out.println();
        list.deleteAtHead();
        list.print();
        System.out.println("\nLength of list is: "+list.length());
    }
}