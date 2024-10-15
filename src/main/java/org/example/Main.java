package org.example;

import queue.Queue;
import stack_array.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> fila = new Queue<>();

        fila.enqueue(10);
        fila.enqueue(20);
        fila.dequeue();
        fila.enqueue(30);
        fila.enqueue(40);

        System.out.println(fila);

    }
}