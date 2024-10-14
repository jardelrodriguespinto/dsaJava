package stack_linked_list;

public class Node<E> {
    private E data;
    private Node<E> next;

    public Node(E obj) {
        data = obj;
        this.next = null;
    }

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
