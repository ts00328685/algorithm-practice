package com.heloword.practice.ds.linkedlist;

import lombok.Data;
import org.junit.Test;

public class SinglyLinkedList {

    @Test
    public void test() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(100);
        list.insert(99);
        list.insert(98);


        list.delete();
        
        list.display();
    }

    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void insert(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;

        head = newNode;
    }

    public Node delete() {
        Node temp = head;
        head = temp.next;
        return temp;
    }

    public void display() {
        System.out.println("List first -> last");
        Node current = head;
        while(current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("finished printing");
    }
}


class Node {

    public int value;
    public Node next;

    public void display() {
        System.out.println("value: " + this.value);
    }
}
