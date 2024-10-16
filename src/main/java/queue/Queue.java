package queue;

public class Queue<T>
{
    Node<T> firstNode;
    Node<T> lastNode;
    int currentSize;

    public Queue()
    {
        this.firstNode = null;
        this.lastNode = null;
        this.currentSize = 0;

    }

    public void enqueue(T data)
    {
        Node<T> newNode = new Node<>(data);

        if (isEmpty())
        {
            firstNode = newNode;
            lastNode = newNode;
            firstNode.setNext(lastNode);
            currentSize++;
            return;
        }

        lastNode.setNext(newNode);
        lastNode = newNode;

        currentSize++;
    }

    public T dequeue()
    {
        if (! isEmpty())
        {
            T data = firstNode.getData();

            firstNode = firstNode.getNext();

            if (firstNode == null)
            {
                lastNode = null;
            }

            currentSize--;
            return data;
        }

        return null;
    }

    public T peek()
    {
        return firstNode.getData();
    }


    public int size()
    {
        return this.currentSize;
    }

    public boolean isEmpty()
    {
        return currentSize == 0;
    }

    public Node<T> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<T> firstNode) {
        this.firstNode = firstNode;
    }

    public Node<T> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<T> lastNode) {
        this.lastNode = lastNode;
    }
}
