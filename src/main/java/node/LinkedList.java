package node;

public class LinkedList <E>{
    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    public LinkedList(){
        head = null;
        tail = null;
        currentSize = 0;
    }

    public void addFist(Node<E> nextNode){

        if (head == null)
            head = tail = nextNode;

        nextNode.setNext(head);

        head = nextNode;

        currentSize++;
    }

    public void addLast(Node<E> nextNode){
        if (head == null)
            head = tail = nextNode;


        tail.setNext(nextNode);

        tail = nextNode;

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
            head = tail = null;

            currentSize = 0;

            return tmp;
        }

        head = head.getNext();

        currentSize--;

        return tmp;
    }



    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

}
