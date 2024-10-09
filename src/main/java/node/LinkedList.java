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
        if (head == null) {
            head = tail = nextNode;
            currentSize++;
        }

        tail.setNext(nextNode);

        tail = nextNode;

        currentSize++;

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
