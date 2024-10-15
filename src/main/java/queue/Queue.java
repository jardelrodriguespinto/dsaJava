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

    public void dequeue()
    {
        if (! isEmpty())
        {
            firstNode = firstNode.getNext();

            if (firstNode == null)
            {
                lastNode = null;
            }

            currentSize--;
        }
    }


    public int size()
    {
        return this.currentSize;
    }

    public boolean isEmpty()
    {
        return currentSize == 0;
    }
}
