package queue;

public class Node<T>
{
    private Node<T> previous;
    private Node<T> next;
    private T data;

    public Node(T obj)
    {
        previous = null;
        next = null;
        data = obj;
    }

    public Node<T> getPrevious()
    {
        return previous;
    }

    public void setPrevious(Node<T> previous)
    {
        this.previous = previous;
    }

    public Node<T> getNext()
    {
        return next;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }

    public T getData()
    {
        return data;
    }

    public void getData(T obj)
    {
        this.data = obj;
    }
}
