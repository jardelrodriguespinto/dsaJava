package node;

public class LinkedList <E>{
    private Node<E> head;
    private Node<E> tail;
    private Node<E> current;
    private Node<E> previous;
    private int currentSize;

    public LinkedList(){
        head = null;
        tail = null;
        current = null;
        previous = null;
        currentSize = 0;
    }

    public void addFist(Node<E> nextNode){

        if (head == null)
            head = tail = current = nextNode;
        else
        {
            nextNode.setNext(head);

            head = nextNode;

            current = head;
        }
        currentSize++;
    }

    public void addLast(Node<E> nextNode){
        if (head == null)
            head = tail = current = nextNode;
        else
        {
            tail.setNext(nextNode);

            tail = nextNode;

            current = head;

        }
        currentSize++;
    }

    /// the remove first method must return the first element, however, if the list
    // is empty it will return null
    // there are couple considerations related with data structures like boundaries
    // if the list is empty, if there is only a single element
    //if we're manipulating in the begging, end or middle of a certain data structure;

    public <E> Node<E> removeFirst(){

        //criar variavel temporaria no escopo global
        Node<E> tmp = null;

        //lista vazia
        if (head == null)
            return tmp;

        //criar variavel temporaria
        tmp = (Node<E>) head;

        //se houver apenas um elemento na lista
        if (currentSize == 1)
        {
            head = tail = previous = current = null;

            currentSize = 0;

            return tmp;
        }

        head = head.getNext();

        current = head;

        previous = null;

        currentSize--;

        return tmp;
    }

    public Node<E> removeLast() {
        if (head == null)
            return null;

        if (head == tail)
            return removeFirst();

        current = head;
        previous = null;

        while (current.getNext() != tail) {
            previous = current;
            current = current.getNext();
        }

        Node<E> tmp = tail;

        tail = current;
        tail.setNext(null);

        currentSize--;

        return tmp;
    }

    public boolean contains(E obj){

        if (head == null)
            return false;

        if (head == tail && head.getData() == obj) {
            return true;
        }

        Node<E> tmp = head;

        while (tmp != null) {

            if (tmp.getData() == obj)
                return true;

            tmp = tmp.getNext();
        }



        return false;
    }


    public Node<E> find(E obj){

        return null;
    }
    public Node<E> remove(E obj){

        return null;
    }


    public Node<E> getTail() {
        return tail;
    }

    public Node<E> getCurrent() {
        return current;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public Node<E> getHead() {
        return head;
    }

    public int getCurrentSize() {
        return currentSize;
    }
}
