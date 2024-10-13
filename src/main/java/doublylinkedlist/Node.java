package doublylinkedlist;

public class Node<T> {
    private Node<T> previous;
    private Node<T> next;
    private T obj;

    public Node(){
        previous = null;
        next = null;
        obj = null;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
