import java.util.NoSuchElementException;

public class MyLinkedListStack<E> implements MyStack<E> {

    private MyLinkedList<E> myLinkedList;

    public MyLinkedListStack(){
        myLinkedList = new MyLinkedList<>();
    }
    @Override
    public void push(E element) {
        myLinkedList.add(element);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return myLinkedList.remove(0);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return myLinkedList.get(0);
    }

    @Override
    public int size() {
        return myLinkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return myLinkedList.get(0)==null;
    }
}
