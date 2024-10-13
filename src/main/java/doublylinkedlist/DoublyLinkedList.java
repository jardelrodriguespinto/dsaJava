package doublylinkedlist;

public class DoublyLinkedList<T>
{
    Node<T> head;
    Node<T> tail;
    int currentSize;

    public DoublyLinkedList()
    {
        head = null;
        tail = null;
        currentSize = 0;
    }

    //addFirst
    public void addFirst(Node<T> newNode)
    {
        if (isEmpty())
            head = tail = newNode;

        head.setPrevious(newNode);

        newNode.setNext(head);

        head = newNode;

        currentSize++;
    }

    //removeFirst
    public Node<T> removeFirst()
    {
        if (isEmpty())
            return null;

        if (head == tail)
        {
            Node<T> tmp = head;

            head = tail = null;

            currentSize--;

            return tmp;
        }

        Node<T> tmp = head;

        head = head.getNext();

        currentSize--;

        return tmp;
    }

    //addLast
    public void addLast(Node<T> newNode)
    {
        if (isEmpty())
        {
            head = tail = newNode;
        }

        newNode.setPrevious(tail);
        tail.setNext(newNode);

        tail = newNode;

        currentSize++;
    }

    //removeLast
    public Node<T> removeLast()
    {
        if (isEmpty())
            return null;

        Node<T> tmp = tail;

        if (head == tail)
        {
            head = tail = null;

            currentSize--;

            return tmp;
        }

        tail = tail.getPrevious();

        currentSize--;

        return tmp;
    }


    //contains
    public boolean contains(T obj)
    {
        if (isEmpty())
            return false;

        if (head == tail)
            return obj.equals(head.getData());

        Node<T> tmp = head;

        while (tmp != null)
        {
            if (obj.equals(head.getData()))
                return true;

            tmp = tmp.getNext();
        }

        return false;
    }


    //indexOf
    public int indexOf(T obj)
    {
        if (isEmpty())
            return -1;

        if (head == tail)
            return 0;

        Node<T> tmp = head;

        int count = 0;

        while (tmp != null)
        {
            if (obj.equals(tmp.getData()))
                return count;

            tmp = tmp.getNext();
            count++;

        }

        return -1;
    }

    //remove
    /*
    Remove the first node with the value, if does exist
    */
    public Node<T> remove(T obj)
    {
        return null;
    }


    //isEmpty
    public boolean isEmpty()
    {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }
}
