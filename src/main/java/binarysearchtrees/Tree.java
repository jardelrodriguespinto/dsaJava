package binarysearchtrees;

public interface Tree<T>
{
    public void insert(T data);
    public void remove(T data);
    public void transversal();
    public T getMin();
    public T getMax();

}
