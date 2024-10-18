package binarysearchtrees;
public class Node<T extends Comparable<T>>
{
    private Node<T> leftNode;
    private Node<T> rightNode;
    private Node<T> parentNode;

    private T data;

    public Node(T obj, Node<T> parentNode)
    {
        this.parentNode = parentNode;
        this.data = obj;
    }

    public Node<T> getLeftNode()
    {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode)
    {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode()
    {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode)
    {
        this.rightNode = rightNode;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public int compareTo(T o)
    {
        return this.data.compareTo(o);
    }

    public Node<T> getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node<T> parentNode) {
        this.parentNode = parentNode;
    }
}
