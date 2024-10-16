package doublylinkedlist;

public class LinkedListHelper<T>
{
    public void reverse(DoublyLinkedList<T> linkedList)
    {
        if (!linkedList.isEmpty())
        {
            Node<T> tmp = linkedList.getTail();

            linkedList.getTail().setNext(null);
            linkedList.getHead().setPrevious(null);

            linkedList.setTail(linkedList.getHead());

            while (tmp != null)
            {
                Node<T> tmpPrevious = tmp.getPrevious();

                tmp.setPrevious(tmp.getNext());
                tmp.setNext(tmp.getPrevious());

                tmp = tmpPrevious;
            }
        }
    }
}
