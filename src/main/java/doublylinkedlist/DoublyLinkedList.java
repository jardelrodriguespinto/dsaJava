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

        if (currentSize == 1)
        {
            tail.setPrevious(head);
            tail.setNext(null);
            tail = head;
            head = newNode;
            currentSize++;
            return;
        }

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

        if (currentSize == 1)
        {
            tail = newNode;
            tail.setPrevious(head);
            tail.setNext(null);
            head.setNext(tail);
            head.setPrevious(null);
            currentSize++;
            return;
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
            if (obj.equals(tmp.getData()))
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
        Node<T> tmp = head;

        while (tmp != null)
        {
            if (obj.equals(tmp.getData()))
            {
                if (tmp == head)
                {
                    head = tmp.getNext();

                    if (head != null)
                        head.setPrevious(null);
                    else
                        tail = null;
                }
                // Se o nó a ser removido é o tail
                else if (tmp == tail)
                {
                    tail = tmp.getPrevious();

                    if (tail != null)
                        tail.setNext(null);
                    else
                        head = null;
                }

                currentSize--;

                return tmp;
            }

            tmp = tmp.getNext();
        }


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

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
