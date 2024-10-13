package org.example;

import node.LinkedList;
import node.Node;

public class Main {
    public static void main(String[] args) {

        Node<String> node1 = new Node<>("gente");
        Node<String> node2 = new Node<>("pessoa");
        Node<String> node3 = new Node<>("passaro");
//        Node<Integer> node3 = 'new Node<>(105);
//        Node<Integer> node4' = new Node<>(75);
//        Node<Integer> node5 = new Node<>(200);


        LinkedList<String> list = new LinkedList<>();

        list.addLast(node1);
        list.addLast(node2);
        list.addLast(node3);


//        list.remove("gente");
        list.removeFirst();
//        list.addFist(node4);
//        list.addFist(node5);


        System.out.println(list);


    }
}