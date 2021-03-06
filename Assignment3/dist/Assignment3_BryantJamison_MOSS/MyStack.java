import java.util.Stack;

/**
 * My implementation of a stack
 *
 * @author Jamison Bryant (jbryan46@montgomerycollege.edu) for CMSC 204 (R. Alexander) M/W 1PM-3PM
 */
public class MyStack<T> implements StackInterface<T>
{
    /**
     * Stack that serves as backbone of MyStack
     */
    private Stack<T> stack;

    /**
     * Creates a new MyStack
     */
    public MyStack()
    {
        stack = new Stack<T>();
    }

    /**
     * Returns if the stack is empty
     *
     * @return True if the stack is empty, false otherwise
     */
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    /**
     * Removes the item at the top of the stack
     *
     * @return The removed item
     */
    public T pop()
    {
        return stack.pop();
    }

    /**
     * Returns the size of the stack
     *
     * @return Stack size
     */
    public int size()
    {
        return stack.size();
    }

    /**
     * Adds an item to the stack
     *
     * @param item Item to add
     * @return True if successful, false otherwise
     */
    public boolean push(T item)
    {
        stack.push(item);

        return true;
    }

    /**
     * Converts the stack to an array
     *
     * @return Stack as an array
     */
    public T[] toArray()
    {
        return (T[]) stack.toArray();
    }

    public T getElementAt(int index)
    {
        return stack.get(index);
    }
}
