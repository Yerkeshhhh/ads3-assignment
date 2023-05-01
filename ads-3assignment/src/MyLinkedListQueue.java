import java.util.NoSuchElementException;

public class MyLinkedListQueue<E> implements MyQueue<E> {

    MyLinkedList<E> myLinkedList;

    public MyLinkedListQueue(){
        myLinkedList = new MyLinkedList<>();
    }

    @Override
    public void enqueue(E element) {
        myLinkedList.add(element);
    }

    @Override
    public E dequeue() {
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
    public boolean isEmpty() {
        return myLinkedList.isEmpty();
    }

    @Override
    public int size() {
        return myLinkedList.size();
    }
}
