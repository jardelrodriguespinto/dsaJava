package exercices;

import queue.Queue;
import stack_linked_list.Stack;

public class Exercices<T>
{
    public boolean isPalindrome(String word)
    {
        word = word.toLowerCase();

        StringBuilder newStr = new StringBuilder();

        Stack<String> stack = new Stack<>();

        for(char c : word.toCharArray())
            stack.push(String.valueOf(c));

        var tmp = stack.getHead();

        while (tmp != null)
        {
            newStr.append(tmp.getData());

            tmp = tmp.getNext();
        }

        return word.contentEquals(newStr);
    }

    public String reverseString(String word)
    {
        StringBuilder newStr = new StringBuilder();

        Stack<String> stack = new Stack<>();

        for(char c : word.toCharArray())
            stack.push(String.valueOf(c));

        var tmp = stack.getHead();

        while (tmp != null)
        {
            newStr.append(tmp.getData());

            tmp = tmp.getNext();
        }

        return newStr.toString();
    }

    public Queue<T> reverseQueue(Queue<T> fila)
    {
        Stack<T> pilha = transformQueueInStack(fila);
        return transformStackInQueue(pilha);
    }
    private Stack<T> transformQueueInStack(Queue<T> fila) {
        Stack<T> pilhaAuxiliar = new Stack<>();

        while (!fila.isEmpty())
            pilhaAuxiliar.push(fila.dequeue());

        return pilhaAuxiliar;
    }
    private Queue<T> transformStackInQueue(Stack<T> pilha)
    {
        Queue<T> fila = new Queue<>();

        while (!pilha.isEmpty())
            fila.enqueue(pilha.pop());

        return fila;
    }

}
