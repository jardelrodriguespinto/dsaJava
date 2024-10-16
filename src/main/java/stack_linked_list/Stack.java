package stack_linked_list;

import java.util.Queue;

public class Stack <T>
{

    int currentSize;
    Node<T> head;
    public Stack()
    {
        head = null;
        currentSize = 0;
    }

    public T push(T data)
    {
        currentSize++;

        Node<T> newNode = new Node<>(data);

        if (isEmpty())
            head = newNode;

        newNode.setNext(head);

        head = newNode;

        return data;
    }

    //peek - return the object at the top without necessaraly remove it

    public T pop()
    {
        if(isEmpty())
            return  null;

        Node<T> tmp = head;

        head = head.getNext();

        return tmp.getData();
    }

    public T peek()
    {
        if (isEmpty())
            return null;

        return head.getData();
    }

    public boolean isEmpty()
    {
        return currentSize == 0;
    }

    public Node<T> getHead() {
        return head;
    }

}
