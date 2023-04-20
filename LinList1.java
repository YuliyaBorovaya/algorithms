package Homework3;

import java.util.List;



public class LinList1 {
    
    private Node head;
    private Node tail;


    private class Node{
        private int value;
        private Node next;
        private Node previous;
    }

    public void revert() {
        Node node = head;
        Node temp = head;
        head = tail;
        tail = temp;

        while(node.nextNode != null) {
            temp = node.nextNode;
            node.nextNode = node.previousNode;
            node.previousNode = temp;
            node = node.previousNode;
        }
    }

    public void print() {
        Node node = head;
        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }



}

