import java.util.NoSuchElementException;

public class MyArrayListQueue<E> implements MyQueue<E> {

    private MyArrayList<E> myArrayList;
    public MyArrayListQueue(){
        myArrayList = new MyArrayList<>();
    }
    @Override
    public void enqueue(E element) {
        myArrayList.add(element);
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
