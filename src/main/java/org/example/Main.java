package org.example;

import binarysearchtrees.BinarySearchTree;
import binarysearchtrees.Node;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);

        System.out.println(binarySearchTree);

    }
}