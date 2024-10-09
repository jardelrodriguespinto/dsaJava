package org.example;

import node.LinkedList;
import node.Node;

public class Main {
    public static void main(String[] args) {

        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(100);
        Node<Integer> node3 = new Node<>(105);
        Node<Integer> node4 = new Node<>(75);
        Node<Integer> node5 = new Node<>(200);


        LinkedList<Integer> list = new LinkedList<>();

        list.addFist(node1);

        list.addFist(node3);


        list.addLast(node2);
        list.addLast(node4);
        list.addFist(node5);


        System.out.println(list);


    }
}