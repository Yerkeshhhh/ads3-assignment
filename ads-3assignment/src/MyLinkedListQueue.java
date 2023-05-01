public class MyLinkedListQueue<E> implements MyQueue<E> {

    MyLinkedList<E> myLinkedList;

    public MyLinkedListQueue(){
        myLinkedList = new MyLinkedList<>();
    }

    @Override
    public void enqueue(E element) {

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
