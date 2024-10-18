package binarysearchtrees;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>
{
    private Node<T> rootNode;
    private int currentSize;

    public BinarySearchTree()
    {
        rootNode = null;
        currentSize = 0;
    }

    @Override
    public void insert(T data)
    {
        Node<T> newNode;

        if (isEmpty())
        {
            newNode = new Node<>(data, null);
            rootNode = newNode;
        }
        else
            insert(data, rootNode);
    }

    private void insert(T data, Node<T> newNode)
    {
        if (rootNode.getData().compareTo(newNode.getData()) < 0)
        {
            if (newNode.getLeftNode() != null)
                insert(data,newNode.getLeftNode());
            else
                newNode.setLeftNode(new Node<>(data, newNode));
        }
        else if (rootNode.getData().compareTo(newNode.getData()) > 0)
        {
            if (newNode.getRightNode() != null)
                insert(data,newNode.getRightNode());
            else
                newNode.setRightNode(new Node<>(data, newNode));

        }
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void transversal() {

    }

    @Override
    public T getMin() {
        return null;
    }

    @Override
    public T getMax() {
        return null;
    }

    public boolean isEmpty()
    {
        return rootNode == null;
    }

    public int size()
    {
        return currentSize;
    }
}
