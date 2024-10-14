package stack_array;

public class Stack<T>
{
    private int currentSize;
    private T[] stack;

    public Stack()
    {
        stack = (T[]) new Object[1];
    }

    public void push(T newData)
    {
       if (currentSize == stack.length)
           resize(2 * currentSize);

       stack[currentSize++] = newData;
    }

    public T pop()
    {
        if (isEmpty())
            return null;

        T item = stack[currentSize--];

        stack[currentSize] = null;

        if (currentSize > 0 && currentSize == stack.length / 4)
            resize(currentSize / 2);


        return item;
    }

    private void resize(int newSize)
    {
        T[] newStack = (T[]) new Object[newSize];

        for (int i = 0; i < currentSize; i++)
            newStack[i] = stack[i];

        stack = newStack;
    }

    public boolean isEmpty()
    {
        return currentSize == 0;
    }
}
