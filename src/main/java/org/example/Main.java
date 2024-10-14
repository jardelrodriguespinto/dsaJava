package org.example;

import doublylinkedlist.DoublyLinkedList;
import doublylinkedlist.Node;

public class Main {
    public static void main(String[] args) {

        Node<Integer> node = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        Node<Integer> node4 = new Node<>(40);
        Node<Integer> node5 = new Node<>(50);

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addLast(node);
        list.addLast(node2);
        list.addLast(node3);
        list.addLast(node4);
        list.addLast(node5); // tem que cair fora

        list.remove(10);

        System.out.println(list);


    }
}