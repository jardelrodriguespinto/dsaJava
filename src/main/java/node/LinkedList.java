package node;

import java.util.Iterator;

public class LinkedList <E> implements Iterable <E>{
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

        if (isEmpty())
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
        if (isEmpty())
            head = tail = current = nextNode;
        else
        {
            if (currentSize > 1 )
                previous = tail;

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

        Node<E> tmp = null;

        if (isEmpty())
            return tmp;

        tmp = (Node<E>) head;

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
        if (isEmpty())
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

        if (isEmpty())
            return false;

        if (head == tail && head.getData() == obj) {
            return true;
        }

        if (obj == null)
            return false;

        var tmp = head;

        while (tmp != null) {

            if (obj instanceof E)
                return (obj).equals(tmp.getData());

            tmp = tmp.getNext();
        }

        return false;
    }


    public int find(E obj){
        if (isEmpty())
            return -1;

        if (head == tail)
            return 1;

        int index = 1;
        Node<E> tmp = head;

        while (index <= currentSize) {
            if (obj == tmp.getData())
                return index;

            tmp = tmp.getNext();
            index++;
        }

        return -1;
    }

    public Node<E> remove(E obj) {

        if (isEmpty())
            return null;

        if (head == tail) {
            var tmp = head;
            head = tail = current = previous = null;
            currentSize--;
            return tmp;
        }

        var tmp = current;
        Node<E> temp = null;

        //tenho que percorrer a lista
        while (tmp.getNext() != null) {

            //verificar se o valor é igual ao inputado
            //se for se for igual


            if (obj.equals(tmp.getData())) {
                //eu vou armazenar este no
                // em uma variavel temporaria

                temp = current.getNext();

                //vou apontar o proximo no para o proximo do no que irei remover

                current = previous;
                current.setNext(temp);
                break;
            }

            tmp = tmp.getNext();
        }

        currentSize--;

        return temp;
    }

    public boolean isEmpty() {
        return head == null;
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

    public int size() {
        return currentSize;
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorHelper();
    }

    class IteratorHelper implements  Iterator<E>{

        Node<E> index;

        public IteratorHelper() {
            index = head;
        }


        @Override
        public boolean hasNext() {
            return index != null;
        }

        @Override
        public E next() {

            if (!hasNext())
                throw new UnsupportedOperationException();

            E val = index.getData();

            index = index.getNext();

            return val;
        }
    }
}
